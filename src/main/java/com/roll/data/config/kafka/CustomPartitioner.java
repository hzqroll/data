package com.roll.data.config.kafka;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

/**
 * @author haozq
 * Date: 2018/8/25 下午3:59
 */
public class CustomPartitioner implements Partitioner {

	@Override
	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		if (key.equals("a")) {
			return 1;
		} else {
			return 2;
		}
	}

	/**
	 * This is called when partitioner is closed.
	 */
	@Override
	public void close() {

	}

	/**
	 * Configure this class with the given key-value pairs
	 *
	 * @param configs
	 */
	@Override
	public void configure(Map<String, ?> configs) {

	}
}
