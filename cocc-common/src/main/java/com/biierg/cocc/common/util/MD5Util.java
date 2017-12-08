package com.biierg.cocc.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具类
 */
public class MD5Util {

    public static String getDefaultMd5String(String source) {
        return md5String(source, "UTF-8", "");
    }

    public static String getDefaultMd5String(String source, String md5Key) {
        return md5String(source, "UTF-8", md5Key);
    }

    public static String md5String(String source, String charsetName, String md5key) {

        if (source != null) {
            try {
                if (md5key == null) {
                    md5key = "";
                }

                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update((source + md5key).getBytes(charsetName));

                return toHexString(md.digest());
            } catch (NoSuchAlgorithmException e) {
            } catch (UnsupportedEncodingException e) {
            }
        }

        return null;
    }

    public static String md5Stream(InputStream inStream, byte[] md5key) {

        if (inStream != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");

                // 计算文件内容摘要
                int len;
                byte[] buffer = new byte[2048];
                while ((len = inStream.read(buffer)) != -1) {
                    md.update(buffer, 0, len);
                }

                // 附加密钥
                if (md5key != null) {
                    md.update(md5key);
                }

                return toHexString(md.digest());

            } catch (IOException e) {
            } catch (NoSuchAlgorithmException e) {
            }
        }

        return null;
    }

    private static String toHexString(byte[] content) {

        if (content == null) {
            return null;
        }

        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < content.length; i++) {
            if ((0xFF & content[i]) < 0x10) {
                hexString.append("0" + Integer.toHexString((0xFF & content[i])));
            } else {
                hexString.append(Integer.toHexString(0xFF & content[i]));
            }
        }

        return hexString.toString();
    }
}
