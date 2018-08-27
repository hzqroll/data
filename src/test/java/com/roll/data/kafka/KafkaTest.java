package com.roll.data.kafka;

import org.junit.Test;

import com.roll.data.config.kafka.ConsumerClient;

/**
 * @author haozq
 * Date: 2018/8/27 下午3:22
 */
public class KafkaTest {
	private ConsumerClient consumerClient;

	@Test
	public void send() {
		String key = "a";
		String value = "aaaa";
		consumerClient.send(key, value);
	}
}
