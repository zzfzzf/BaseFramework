package com.zzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzy.service.IRedisService;


/**
 * @author zeus @RestController==@Controller+@ResponseBody(默认自动返回JSON数据，作为一个接口)
 */
// 切记一定要标注method=xxxx 否则swagger将会为每个方法包括头部信息创建多个api
@RequestMapping(value = "/zero")
@RestController
public class BaseController {  
	
	@Autowired
	public IRedisService redisService;

	
}