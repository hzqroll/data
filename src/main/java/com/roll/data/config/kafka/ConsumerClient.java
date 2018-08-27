package com.roll.data.config.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author haozq
 * Date: 2018/8/27 下午3:06
 */
@Service
public class ConsumerClient {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String key, String data) {
		kafkaTemplate.send("test", key, data);
	}
}
