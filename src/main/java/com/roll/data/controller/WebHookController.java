package com.roll.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roll.data.config.log.LogConfig;
import com.roll.data.open.WebShenJianShou;
import com.roll.data.open.service.DataWebService;

/**
 * @author haozq
 * Date: 2018/8/20 下午3:06
 */
@RestController
@RequestMapping(value = "/web-hook")
public class WebHookController {

	@Autowired
	private DataWebService dataWebService;

	@RequestMapping(value = "/wall-street", method = RequestMethod.POST)
	public String collectData(@RequestParam("url") String url,
							  @RequestParam("timestamp") long timestamp,//秒级时间戳
							  @RequestParam("sign2") String sign2,//url+user_secret+timestamp的md5值	用来校验数据是否合法
							  @RequestParam("data") String data,//爬取或者监控到的数据	JSON字符串
							  @RequestParam("event_type") String event_type,//事件类型 新增数据 data.new 变动数据 data.updated
							  @RequestParam("crawl_time") long crawl_time,//爬取到这条数据的时间	秒级时间戳
							  @RequestParam("data_key") String data_key,//Webhook调用成功需要返回此值
							  @RequestParam("pk") String pk) {//数据版本的唯一标识
		WebShenJianShou webShenJianShou = new WebShenJianShou(url, timestamp, sign2, data, event_type, crawl_time, data_key, pk);

		LogConfig.getLoggerInstance().info("get data from shenjianshou: {}.", webShenJianShou.toString());
		dataWebService.addData(webShenJianShou);
		return data_key;
	}
}
