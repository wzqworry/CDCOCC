/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.UUID;

/**
 * 文件相关操作工具类，本地方法(非Java官方)
 *
 * @author wen.ding
 */
@Deprecated
public class FileUtilsLocal {
    private static final Logger logger = LoggerFactory.getLogger(FileUtilsLocal.class);

    // 获取上传路径
    public static String uploadPath = PropertiesUtils.getName("uploadPath");

    /**
     * 文件下载
     *
     * @param request      http 请求
     * @param response     http 反馈
     * @param relativePath 文件相对路径
     * @param contentType  内容类别
     */
    public static void download(HttpServletRequest request, HttpServletResponse response, String relativePath,
                                String contentType) throws Exception {

        request.setCharacterEncoding("UTF-8");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        // 获取下载文件绝对路径（统一性处理）
        String absolutePath = getGlobalPath(uploadPath + relativePath);

        // 获取文件的长度
        long fileLength = new File(absolutePath).length();
        // 设置文件输出类型
        response.setContentType(contentType);
        response.setHeader("Content-disposition",
                "attachment; filename=" + new String(relativePath.getBytes("utf-8"), "ISO8859-1"));
        // 设置输出长度
        response.setHeader("Content-Length", String.valueOf(fileLength));
        // 获取输入流
        bis = new BufferedInputStream(new FileInputStream(absolutePath));
        // 输出流
        bos = new BufferedOutputStream(response.getOutputStream());
        byte[] buff = new byte[2048];
        int bytesRead;

        // 写
        while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
            bos.write(buff, 0, bytesRead);
        }
        // 关闭流
        bis.close();
        bos.close();
    }

    // 上传
    public static String upload(@RequestParam MultipartFile[] myfiles, HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // 如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
        // 这里实现文件上传操作用的是commons.io.FileUtils类,它会自动判断/upload是否存在,不存在会自动创建
        String realPath = uploadPath;
        String returnPath = "";// 返回给前台的文件路径，以“,”分割
        StringBuilder sb = new StringBuilder();

        // 设置响应给前台内容的数据格式
        response.setContentType("text/plain; charset=UTF-8");

        // 设置响应给前台内容的PrintWriter对象
        PrintWriter out = response.getWriter();

        // 上传文件的原名(即上传前的文件名字)
        String originalFilename = null;

        // 判断参数
        if (myfiles == null || (myfiles.length <= 1 && myfiles[0].isEmpty())) {
            out.print("|1|请选择文件后上传");
            out.flush();
            return null;
        }

        // 如果只是上传一个文件,则只需要MultipartFile类型接收文件即可,而且无需显式指定@RequestParam注解
        // 如果想上传多个文件,那么这里就要用MultipartFile[]类型来接收文件,并且要指定@RequestParam注解
        // 上传多个文件时,前台表单中的所有<input type="file"/>的name都应该是myfiles,否则参数里的myfiles无法获取到所有上传的文件
        for (MultipartFile myfile : myfiles) {
            if (myfile.isEmpty()) {
                logger.debug("多文件上传中，出现空文件，继续执行...");
            } else {
                originalFilename = myfile.getOriginalFilename();

                if (logger.isDebugEnabled()) {
                    logger.debug("文件原名: " + originalFilename);
                    logger.debug("文件名称: " + myfile.getName());
                    logger.debug("文件长度: " + myfile.getSize());
                    logger.debug("文件类型: " + myfile.getContentType());
                    logger.debug("========================================");
                }

                try {
                    // 这里不必处理IO流关闭的问题,因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉
                    // 此处也可以使用Spring提供的MultipartFile.transferTo(File dest)方法实现文件的上传
                    // 去空格
                    originalFilename = makeFileName(originalFilename);
                    realPath = makePath(originalFilename, uploadPath);
                    realPath = getGlobalPath(realPath); // 处理路径统一问题
                    sb.append("*").append(realPath.substring(uploadPath.length())).append(File.separator).append(originalFilename);

                    FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, originalFilename));
                } catch (IOException e) {
                    logger.error("文件[" + originalFilename + "]上传失败,堆栈轨迹如下", e);

                    out.print("|1|文件上传失败，请重试！！");
                    out.flush();

                    return null;
                }
                response.reset();
            }
        }
        returnPath = sb.toString();
        if (!StringUtil.isEmpty(returnPath)) {
            returnPath = returnPath.substring(1, returnPath.length());
//            returnPath.replace(File.separator, "\\" + File.separator);// 添加转义“\”
            out.print("|0|" + returnPath);
            out.flush();
        }
        // 关闭
        return "";
    }

    // 将文件地址转换成适用于不同操作系统的路径
    public static String getGlobalPath(String realPath) {
        if (StringUtil.isNull(realPath)) {
            logger.error("将文件地址转换成适用于不同操作系统的路径时出现异常，path为null ！");
            return realPath;
        }
//        return realPath.trim().replace(" ", "").replace("/", File.separator).replace("\\", File.separator).trim();
        return realPath.trim().replace("/", File.separator).replace("\\", File.separator).trim();
    }

    /**
     * 生成上传文件的文件名，文件名以：uuid+"-"+ 文件的原始名称
     *
     * @param filename 文件的原始名称
     * @return uuid+"-"+ 文件的原始名称
     */
    private static String makeFileName(String filename) { // 2.jpg
        // 为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
        return UUID.randomUUID().toString().replace("-", "") + "-" + filename;
    }

    /**
     * 为防止一个目录下面出现太多文件，要使用hash算法打散存储
     *
     * @param filename 文件名，要根据文件名生成存储目录
     * @param savePath 文件存储路径
     * @return 新的存储目录
     */
    private static String makePath(String filename, String savePath) {
        filename = filename.trim();
        savePath = savePath.trim();
        // 得到文件名的hashCode的值，得到的就是filename这个字符串对象在内存中的地址
        int hashcode = filename.hashCode();
        int dir1 = hashcode & 0xf; // 0--15
        int dir2 = (hashcode & 0xf0) >> 4; // 0-15
        // 构造新的保存目录
        String dir = savePath + File.separator + dir1 + File.separator + dir2; // upload\2\3 upload\3\5
        // File既可以代表文件也可以代表目录
        File file = new File(dir);
        // 如果目录不存在
        if (!file.exists()) {
            // 创建目录
            file.mkdirs();
        }
        return dir;
    }

    /**
     * TODO 删除文件，可以是文件或文件夹
     *
     * @param fileName 要删除的文件名
     * @return 删除成功返回true，否则返回false
     */
    public static boolean delete(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            logger.error("删除文件失败:" + fileName + "不存在！");
            return false;
        } else {
            if (file.isFile())
                return deleteFile(fileName);
            else
                return deleteDirectory(fileName);
        }
    }

    /**
     * 删除单个文件
     *
     * @param fileName 要删除的文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                logger.debug("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                logger.error("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            logger.error("删除单个文件失败：" + fileName + "不存在！");
            return false;
        }
    }

    /**
     * 删除目录及目录下的文件
     *
     * @param dir 要删除的目录的文件路径
     * @return 目录删除成功返回true，否则返回false
     */
    public static boolean deleteDirectory(String dir) {
        // 如果dir不以文件分隔符结尾，自动添加文件分隔符
        if (!dir.endsWith(File.separator))
            dir = dir + File.separator;
        File dirFile = new File(dir);
        // 如果dir对应的文件不存在，或者不是一个目录，则退出
        if ((!dirFile.exists()) || (!dirFile.isDirectory())) {
            logger.error("删除目录失败：" + dir + "不存在！");
            return false;
        }
        boolean flag = true;
        // 删除文件夹中的所有文件包括子目录
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            // 删除子文件
            if (files[i].isFile()) {
                flag = deleteFile(files[i].getAbsolutePath());
                if (!flag)
                    break;
            }
            // 删除子目录
            else if (files[i].isDirectory()) {
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag)
                    break;
            }
        }
        if (!flag) {
            logger.error("删除目录失败！");
            return false;
        }
        // 删除当前目录
        if (dirFile.delete()) {
            logger.debug("删除目录" + dir + "成功！");
            return true;
        } else {
            return false;
        }
    }


    /**
     * 获取页面文件转为byte[],用于LED模板配置页面
     *
     * @param myfiles
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    public static byte[] uploadToBytes(MultipartFile[] myfiles, HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // 如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
        // 这里实现文件上传操作用的是commons.io.FileUtils类,它会自动判断/upload是否存在,不存在会自动创建
        // String uploadPath = PropertiesUtils.getName("uploadPath");
        // 设置响应给前台内容的数据格式
        response.setContentType("text/plain; charset=UTF-8");

        // 设置响应给前台内容的PrintWriter对象
        PrintWriter out = response.getWriter();

        // 上传文件的原名(即上传前的文件名字)
        String originalFilename = null;
        // 如果只是上传一个文件,则只需要MultipartFile类型接收文件即可,而且无需显式指定@RequestParam注解
        // 如果想上传多个文件,那么这里就要用MultipartFile[]类型来接收文件,并且要指定@RequestParam注解
        // 上传多个文件时,前台表单中的所有<input
        // type="file"/>的name都应该是myfiles,否则参数里的myfiles无法获取到所有上传的文件
        for (MultipartFile myfile : myfiles) {
            if (myfile.isEmpty()) {
                out.print("_1_请选择文件后上传");
                out.flush();
                return null;
            } else {
                originalFilename = myfile.getOriginalFilename();

                if (logger.isDebugEnabled()) {
                    logger.debug("文件原名: " + originalFilename);
                    logger.debug("文件名称: " + myfile.getName());
                    logger.debug("文件长度: " + myfile.getSize());
                    logger.debug("文件类型: " + myfile.getContentType());
                    logger.debug("========================================");
                }

                try {
                    InputStream inputStream = myfile.getInputStream();
                    byte[] byt = new byte[inputStream.available()];
                    inputStream.read(byt);
                    response.reset();
                    return byt;
                } catch (IOException e) {
                    logger.error("文件[" + originalFilename + "]上传失败,堆栈轨迹如下", e);
                    out.print("_1_文件上传失败，请重试！！");
                    out.flush();
                    return null;
                }
            }
        }
        // 关闭
        return null;
    }

    public static void main(String[] args) {
        // // 删除单个文件
        // String file = "c:/test/test.txt";
        // DeleteFileUtil.deleteFile(file);
        // System.out.println();
        // 删除一个目录
        String dir = "D:/home/web/upload/upload/files";
        deleteDirectory(dir);
        // System.out.println();
        // // 删除文件
        // dir = "c:/test/test0";
        // DeleteFileUtil.delete(dir);

    }
}
