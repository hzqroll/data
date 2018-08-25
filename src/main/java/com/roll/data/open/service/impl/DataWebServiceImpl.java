package com.roll.data.open.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.roll.data.open.Data;
import com.roll.data.open.WebShenJianShou;
import com.roll.data.open.dao.DataMapper;
import com.roll.data.open.service.DataWebService;

/**
 * @author haozq
 * Date: 2018/8/21 上午11:06
 */
@Service
public class DataWebServiceImpl implements DataWebService {

	@Autowired
	private DataMapper dataMapper;

	@Override
	public void addData(WebShenJianShou webShenJianShou) {
		String dataString = JSON.toJSONString(webShenJianShou);
		Data data = new Data();
		data.setCreatedTime(new Date());
		data.setData(dataString);
		data.setSource("shenjianshou");
		data.setStatus((byte) 0);
		data.setUpdatedTime(new Date());
		dataMapper.insert(data);
	}
}
