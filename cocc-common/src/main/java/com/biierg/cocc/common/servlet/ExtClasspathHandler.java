package com.biierg.cocc.common.servlet;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.util.Constants;

/**
 * 容器启动/关闭事件监听器；本类用于在容器启动后添加外部classpath
 * 
 * @author lei
 */
public class ExtClasspathHandler implements ServletContextListener {
	private Logger logger = null;

	private static final String EXT_CLASSPATH_DIR = "extClasspath";

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	@Override
	public void contextInitialized(ServletContextEvent evt) {
		ServletContext currentServletContext = evt.getServletContext();

		Constants.ROOT_DIR = currentServletContext.getRealPath("/");
		Constants.CATALINA_HOME = System.getProperty("catalina.home");

		String extClasspaths = currentServletContext.getInitParameter(EXT_CLASSPATH_DIR);
		String[] extClasspathAry = extClasspaths.split(",");
		// 初始化Log4j2
		for (String extClasspath : extClasspathAry) {
			File extClasspathDir = new File(extClasspath + "/log4j2.xml");

			if (extClasspathDir.exists()) {
				//DOMConfigurator.configure(extClasspathDir.getPath());
				LoggerContext context =(LoggerContext) LogManager.getContext(false);
				context.setConfigLocation(extClasspathDir.toURI());
				//重新初始化Log4j2的配置上下文
				context.reconfigure();
				logger = LoggerFactory.getLogger(ExtClasspathHandler.class);

				break;
			}
		}

		
		if (extClasspathAry != null && extClasspathAry.length > 0) {

			// 顺序添加全部extClassPath
			for (String extClasspath : extClasspathAry) {
				appendExtClassPath(extClasspath);
			}
		}
	}
	
	/**
	 * 添加extClassPath
	 * 
	 * @param extClasspath
	 */
	private void appendExtClassPath(String extClasspath) {
		
		if (extClasspath != null) {
			File extClasspathDir = new File(extClasspath);

			if (extClasspathDir.exists()) {

				// 查找ClassLoader及其addURL方法
				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				Method addUrlMethod = null;
				try {
					addUrlMethod = URLClassLoader.class.getDeclaredMethod("addURL", new Class[] { URL.class });
					if (addUrlMethod != null) {
						addUrlMethod.setAccessible(true);
					}
				} catch (Throwable e) {
					logger.error("在添加外部扩展CLASSPATH[{}]时出现异常", extClasspathDir.getPath());
				}

				if (addUrlMethod != null) {

					try {
						// 将extClasspathDir加入CLASSPATH
						addUrlMethod.invoke(classLoader, new Object[] { extClasspathDir.toURI().toURL() });
						logger.info("append extClasspath:{}", extClasspathDir.getPath());

						// 将extClasspathDir下的所有jar文件加入CLASSPATH
						File[] jarFiles = extClasspathDir.listFiles(new FilenameFilter() {
							@Override
							public boolean accept(File dir, String name) {
								return name.endsWith(".jar");
							}
						});

						if (jarFiles != null && jarFiles.length > 0) {
							for (File jarFile : jarFiles) {
								addUrlMethod.invoke(classLoader, new Object[] { jarFile.toURI().toURL() });
								logger.info("append extJarFile:{}", jarFile.getPath());
							}
						}
					} catch (Throwable e) {
						logger.error("在添加外部扩展CLASSPATH[{}]时出现异常", extClasspathDir.getPath());
					}

				} else {
					logger.error("在给定的类加载器内未找到addURL方法");
				}

			} else {
				logger = LoggerFactory.getLogger(ExtClasspathHandler.class);
				logger.error("在配置文件web.xml中指定的{}[{}]不存在", EXT_CLASSPATH_DIR, extClasspath);
			}
		}
	}
}
