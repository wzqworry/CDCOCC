package com.biierg.cocc.common.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.bean.LedConfiguration;

public class LedMonitorUtils {
	private final static Logger logger = LoggerFactory.getLogger(LedMonitorUtils.class);

	public static void print( Object str ) {
		System.out.println( str );
	}


	// byteArr To HexString
		public static String byteArrToHexString( byte[] src ) {
			StringBuilder stringBuilder = new StringBuilder( "" );

			if (src == null || src.length <= 0) {
				return null;
			}

			for ( int i = 0; i < src.length; i++ ) {
				int v = src[i] & 0xFF;
				String hv = Integer.toHexString(v);
				if ( hv.length() < 2 ) {
					stringBuilder.append(0);
				}
				stringBuilder.append( hv );
				stringBuilder.append( " " );
			}

			return stringBuilder.toString();
		}
	// list to byte array
	@SuppressWarnings("rawtypes")
	public static byte[] listToByteArray( List list ) {
		if ( list == null ) {
			return null;
		}

		//Utils.print( list );

		byte[] info = new byte[ list.size() ];

		for( int i = 0; i < list.size(); i++ ) {
			//Utils.print( ( byte ) list.get( i ) );
			info[ i ] = ( Byte ) list.get( i );
		}

		return info;
	}

	// byte array to list
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List byteArrayToList( byte[] arr ) {
		if ( arr == null ) {
			return null;
		}

		List list = new ArrayList();

		for( int i = 0; i < arr.length; i++ ) {
			//Utils.print( ( byte ) list.get( i ) );
			list.add( ( byte ) arr[ i ] );
		}

		return list;
	}


	// 组装需要发送的数据  输入文件的文本内容
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static byte[] getByteArrToSendFromText( String text ) {
		// 构建发送的内容
		List<Byte> list = new ArrayList<Byte>();

		// 帧头	0x02，表明一帧的开始，为接收方提供同步
		list.add( (byte) 0x02 );

		List<Byte> changingDataList = new ArrayList<Byte>();
		
		// 可变信息标志 地址 。2 字节
		changingDataList.add( (byte) 48 );  // 十六进制的 30
		changingDataList.add( (byte) 48 );

		// 帧类型   2 字节   -- 必须是 10，两个字节分开存
		changingDataList.add( (byte) 49 );
		changingDataList.add( (byte) 48 );

		// 数据
		// a 文件名
		//String fileName = System.getProperty("user.dir") + File.separator + "play.lst";

		byte[] fileNameArr = {};

		try {
			fileNameArr = ( "d:" + File.separator + "play.lst" ).getBytes( "UTF-8" ); //fileName.getBytes( "UTF-8" );
		} catch ( UnsupportedEncodingException e ) {
			e.printStackTrace();
		}

		for( int i = 0; i < fileNameArr.length; i++ ) {
			changingDataList.add( (byte) fileNameArr[ i ] );
		}

		// b 文件名 后的 分隔符         1 字节，0x2B，表明 文件名 结束
		changingDataList.add( (byte) 0x2B );

		// c 判断 文件长度。  生成必要的 指针偏移    todo
		/*		long fileLength = file.length();

		int intFileLength = 0;

		if ( fileLength == 0 ) {
			Utils.print( "client: file not found or it is empty." );
		} else if ( fileLength <= 2048 ) {
			intFileLength = ( int ) fileLength;
		} else {
			Utils.print( "client: This file is bigger than 2048 bytes." );
			// todo
		}*/

		// d 文件指针偏移    转换为  4 字节十六进制数，先发高字节，后发低字节
		changingDataList.add( (byte) 0 );
		changingDataList.add( (byte) 0 );
		changingDataList.add( (byte) 0 );
		changingDataList.add( (byte) 0 );

		// e 获取并添加文件内容
		String fileContent = text;
		byte[] fileContentArr = null;
		try {
			fileContentArr = fileContent.getBytes( "GB2312" );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for( int i = 0; i < fileContentArr.length; i++ ) {
			changingDataList.add( (byte) fileContentArr[ i ] );
		}


		// 计算 帧校验   2 字节
		short valid = genCrc( LedMonitorUtils.listToByteArray( changingDataList ),
				changingDataList.size() );

		byte[] reArr = new byte[2];
		getBytes4Bigendian( valid, reArr );

		List validCrcList = new ArrayList();
		validCrcList.add( reArr[ 0 ] );
		validCrcList.add( reArr[ 1 ] );



		// 帧数据 的字符转义
		replaceCrcCheckByte( changingDataList );

		// 将动态帧数据，添加到 list 里
		list.addAll( changingDataList );

		// 帧校验 的字符转义
		replaceCrcCheckByte( validCrcList );

		// 将校验数据，添加到 list 里
		list.addAll( validCrcList );


		// 1 字节  帧尾
		list.add( (byte) 0x03 );

		return LedMonitorUtils.listToByteArray( list );
	}







	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void replaceCrcCheckByte( List list ) {
		//print( list );

		// 应该第一个就判断 0x1b。否则，0x03 和 0x02 ，会重复添加 0x1b
		byte[] arrToCheck = { 0x1b, 0x03, 0x02 };


		for( int i = 0; i < arrToCheck.length; i++ ) {
			for( int j = 0; j < list.size(); j++ ) {
				if ( arrToCheck[ i ] == ( Byte ) list.get( j ) ) {
					byte temp = ( Byte ) list.get( j );

					list.remove( j );
					list.add( j, ( byte ) 0x1b );

					if ( temp == ( byte ) 0x1b ) {
						list.add( j + 1, ( byte ) 0x00 );
					} else if ( temp == ( byte ) 0x02 ) {
						list.add( j + 1, ( byte ) 0xe7 );
						j++;
					} else if ( temp == ( byte ) 0x03 ) {
						list.add( j + 1, ( byte ) 0xe8 );
					}
				}
			}
		}

		//print( list );
	}

	// CRC 算法的 JAVA 实现
	public static short genCrc( byte[] frame, int frame_len ) {
		byte c, treat, bcrc;
		short wcrc = 0;
		short i, j;

		for ( i = 0; i < frame_len; i++ ) {
			c = frame[i];

			for (j = 0; j < 8; j++) {
				treat = (byte) (c & 0x80);
				c <<= 1;
				bcrc = (byte) ( (wcrc >> 8) & 0x80);
				wcrc <<= 1;

				if ( treat != bcrc ) {
					wcrc ^= 0x1021;
				}
			}
		}
		return wcrc;
	}



	public static byte[] strToByteArr( String st ) {
		if ( st == null ) {
			return null;
		}

		byte[] arr = new byte[ st.length() ];

		for( int i = 0; i < st.length(); i++ ) {
			arr[ i ] = (byte) st.charAt( i );
		}

		return arr;
	}

	/** 将输入的整数值转换为字节数组；遵循大端模式	 */
	public static byte[] getBytes4Bigendian( int intVal, byte[] valBytes ) {
		for ( int i = 0; valBytes != null && i < valBytes.length; i++ ) {
			valBytes[ valBytes.length - 1 - i ] = ( byte ) ( ( intVal >>> ( 8 * i ) ) & 0xFF );
		}

		return valBytes;
	}
	
	/** 
     * 根据byte数组，生成文件  
     * @param bfile 文件数组 
     * @param filePath 文件存放路径 
     * @param fileName 文件名称 
     */  
    public static void byte2File(byte[] bfile,String filePath,String fileName){  
        BufferedOutputStream bos=null;  
        FileOutputStream fos=null;  
        File file=null;  
        try{  
            File dir=new File(filePath);  
            if(!dir.exists() && !dir.isDirectory()){//判断文件目录是否存在    
                dir.mkdirs();    
            }  
            file=new File(filePath+fileName);  
            fos=new FileOutputStream(file);  
            bos=new BufferedOutputStream(fos);  
            bos.write(bfile);  
        }   
        catch(Exception e){  
            System.out.println(e.getMessage());  
            e.printStackTrace();    
        }  
        finally{  
            try{  
                if(bos != null){  
                    bos.close();   
                }  
                if(fos != null){  
                    fos.close();  
                }  
            }  
            catch(Exception e){  
                System.out.println(e.getMessage());  
                e.printStackTrace();    
            }  
        }  
    } 
    
    
    
    
    
    /**
	 * 读取playlst
	 * @param filePath
	 * @return
	 */
	public static StringBuffer readFile(String filePath) throws Exception{
		StringBuffer sf = new StringBuffer();
		String temp = null;
		File f=new File(filePath);
		InputStreamReader read = new InputStreamReader( new FileInputStream(f),"GB2312" ); // "d:\\dddd.txt") );
		BufferedReader in=new BufferedReader(read);
		while( ( temp = in.readLine() ) != null ) {
			sf.append( temp );
			sf.append( "\n" );
		}
		in.close();
		return sf;
	}
	
	/**
	 * 返回text对应的那一行
	 * @param ledMessage
	 * @param text
	 * @return
	 * @throws Exception
	 */
	public static String  readAndReturn(String text, byte[] file) throws Exception{
		String temp = null;
		String temp2=null;
		InputStream files = new ByteArrayInputStream(file);
		InputStreamReader read = new InputStreamReader(files,"GB2312" ); // "d:\\dddd.txt") );
		BufferedReader in=new BufferedReader(read);
		while( ( temp = in.readLine() ) != null ) {
			if(temp.startsWith(text)) {
				temp2=temp;
				break;
			}
		}
		in.close();
		return temp2;
	}
	
	/**
	 * 更改日常播报内容
	 * @param info
	 * @return
	 */
	public static String updateUsualBroadCast(LedConfiguration ledMessage,String text) {
		String str = text;
		logger.info("text---"+text);
		
		String ziti = str.substring(str.indexOf("\\f"), str.indexOf(",", str.indexOf("\\f")));
		logger.info("ziti---"+ziti);
		
		String zihao = str.substring(str.indexOf(ziti)+ziti.length()+1, str.indexOf(ziti)+ziti.length()+3);
		logger.info("zihao---"+zihao);
		
		String color = str.substring(str.indexOf("\\c")+2, str.indexOf("\\c")+14);
		logger.info("color---"+color);
		
		String content = str.substring(str.indexOf("\\T")+2);
		logger.info("content---"+content);
		
		if(ledMessage.getR2_mode() == null || ledMessage.getR2_mode() == 2) {
			//处理人工录入紧急事件及其他
			if(ledMessage.getR2_fontsize() != null) {
				str = str.replace(zihao, ledMessage.getR2_fontsize().toString());
				
			}
			if(ledMessage.getR2_color() != null) {
				str = str.replace(color, ledMessage.getR2_color());
			}
			
			if(ledMessage.getR2_content() != null) {
				str = str.replace(content, ledMessage.getR2_content());
			}
			str += "\n";
			
		} else if(ledMessage.getR2_mode() == 1) {
			//处理突发紧急事件
			if(ledMessage.getR2_fontsize() != null) {
				str = str.replace(zihao, ledMessage.getR2_fontsize().toString());				
			}
			if(ledMessage.getR2_color() != null) {
				str = str.replace(color, ledMessage.getR2_color());
			}
			
			if(ledMessage.getR2_content() != null) {
				str = str.replace(content, ledMessage.getR2_content());
			}
			str += "\n";
		}
		str += "\n";
		logger.info("str---"+str);
		return str;
	}	
	/**
	 * 更改安全运营天数
	 * @param info
	 * @return
	 */
	public static String updateSecuretyDays(LedConfiguration ledMessage,String text) {
		String str = text;
		logger.info("text---"+text);
		
		String ziti = str.substring(str.indexOf("\\f"), str.indexOf(",", str.indexOf("\\f")));
		logger.info("ziti---"+ziti);
		
		String zihao = str.substring(str.indexOf(ziti)+ziti.length()+1, str.indexOf(ziti)+ziti.length()+3);
		logger.info("zihao---"+zihao);
		
		String color = str.substring(str.indexOf("\\c")+2, str.indexOf("\\c")+14);
		logger.info("color---"+color);
		
		String content = str.substring(str.indexOf("\\T")+2);
		logger.info("content---"+content);
		
		if(ledMessage.getR3_fontsize() != null) {
			str =  str.replace(zihao, ledMessage.getR3_fontsize().toString());
		}
		if(ledMessage.getR3_color() != null) {
			str =  str.replace(color, ledMessage.getR3_color());
		}	
		if(ledMessage.getR3_content() != null) {
			str = str.replace(content, ledMessage.getR3_content());
			str += "\n";
		}
		str += "\n";
		logger.info("str---"+str);		
		return str;
	}	
	/**
	 * 更改集团公司值班领导及电话
	 * @param info
	 * @return
	 */
	public static String updateDutyAndPhone(LedConfiguration ledMessage,String text) {
		String str = text;
		logger.info("text---"+text);
		
		String ziti = str.substring(str.indexOf("\\f"), str.indexOf(",", str.indexOf("\\f")));
		logger.info("ziti---"+ziti);
		
		String zihao = str.substring(str.indexOf(ziti)+ziti.length()+1, str.indexOf(ziti)+ziti.length()+3);
		logger.info("zihao---"+zihao);
		
		String color = str.substring(str.indexOf("\\c")+2, str.indexOf("\\c")+14);
		logger.info("color---"+color);
		
		String content = str.substring(str.indexOf("\\T")+2);
		logger.info("content---"+content);
		
		if(ledMessage.getR4_fontsize() != null) {
			str =  str.replace(zihao, ledMessage.getR4_fontsize().toString());
		}
		if(ledMessage.getR4_color() != null) {
			str =  str.replace(color, ledMessage.getR4_color());
		}	
		if(ledMessage.getR4_content() != null) {
			str = str.replace(content, ledMessage.getR4_content());
			str += "\n";
		}
		str += "\n";
		logger.info("str---"+str);		
		return str;
	}	

}
