/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

/**
 * 基础文件服务
 * 
 * @author lei
 */
public interface IFileService {

	/**
	 * 保存文件内容至存储
	 * 
	 * @param fileName
	 *            原始文件名
	 * @param fileBytes
	 *            文件内容
	 * @return 动态分配的存储文件名
	 */
	public String write(String fileName, byte[] fileBytes);

	/**
	 * 读取文件内容
	 * 
	 * @param fileName
	 *            存储中的文件名
	 * @return 文件内容
	 */
	public byte[] read(String fileName);
}
