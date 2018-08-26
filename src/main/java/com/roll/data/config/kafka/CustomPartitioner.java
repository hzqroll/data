package com.roll.data.config.kafka;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

/**
 * @author haozq
 * Date: 2018/8/25 下午3:59
 */
public class CustomPartitioner implements Partitioner {

	/**
	 * Compute the partition for the given record.
	 *
	 * @param topic      The topic name
	 * @param key        The key to partition on (or null if no key)
	 * @param keyBytes   The serialized key to partition on( or null if no key)
	 * @param value      The value to partition on or null
	 * @param valueBytes The serialized value to partition on or null
	 * @param cluster    The current cluster metadata
	 */
	@Override
	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		return 1;
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
