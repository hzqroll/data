package com.roll.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roll.data.config.kafka.ConsumerClient;

/**
 * @author haozq
 * Date: 2018/8/27 下午3:12
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	private ConsumerClient consumerClient;

	@RequestMapping("/send")
	public void send(@RequestParam("key") String key,
					 @RequestParam("value") String value) {
		consumerClient.send(key, value);
	}
}
