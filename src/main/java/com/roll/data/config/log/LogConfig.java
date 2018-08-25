package com.roll.data.config.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志单例
 *
 * @author haozq
 * Date: 2018/8/25 上午11:19
 */
public class LogConfig {

	private static volatile Logger logger = null;

	/**
	 * 获取基本日志
	 *
	 * @return 日志标准
	 */
	public static Logger getLoggerInstance() {
		if (logger == null) {
			synchronized (LogConfig.class) {
				if (logger == null) {
					logger = LoggerFactory.getLogger("DEFAULT_LOG");
				}
			}
		}
		return logger;
	}
}
