package cn.com.scott.core;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * @className LogbackConfigListener.java
 * @author 朱浩(zhuhao@yitong.com.cn)
 * @date 2018年6月19日 上午10:33:41
 * @desc log日志配置
 */
public class LogbackConfigListener implements ServletContextListener {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String CONFIG_LOCATION = "logbackConfigLocation";

	public void contextInitialized(ServletContextEvent event) {
		// 从web.xml中加载指定文件名的日志配置文件
		String logbackConfigLocation = event.getServletContext()
				.getInitParameter(CONFIG_LOCATION);
		String fn = event.getServletContext()
				.getRealPath(logbackConfigLocation);
		try {
			LoggerContext loggerContext = (LoggerContext) LoggerFactory
					.getILoggerFactory();
			loggerContext.reset();
			JoranConfigurator joranConfigurator = new JoranConfigurator();
			joranConfigurator.setContext(loggerContext);
			joranConfigurator.doConfigure(fn);
			logger.debug("loaded slf4j configure file from {}", fn, "sss");
		} catch (JoranException e) {
			logger.error("can loading slf4j configure file from {}", fn, e);
		}
	}

	public void contextDestroyed(ServletContextEvent event) {
	    
	}
}