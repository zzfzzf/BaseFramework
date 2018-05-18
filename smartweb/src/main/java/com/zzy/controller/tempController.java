package com.zzy.controller;

import java.util.Objects;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zzy.model.User;
import com.zzy.util.ResultValue;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author zero
 * @version 1.1
 * @createTime：2016年6月30日 
 * 模板Controller
 */
@RestController
@RequestMapping(value = "/temp")
@Api(value = "temp处理类")
public class tempController extends BaseController {
	@ApiOperation(value = "获取temp", notes = "获取temp列表")
	@RequestMapping(method = RequestMethod.GET)
	
	public JSONObject listUser(User user) {
		return ResultValue.success();
	}
 
	@ApiOperation(value = "创建temp", notes = "根据temp对象创建temp")
	@RequestMapping(method = RequestMethod.POST)
	public JSONObject postUser(@RequestBody Object temp) {
		if(Objects.isNull(temp)){
			return ResultValue.paramNonNull();
		}
		return ResultValue.success();
	}
	@Cacheable(keyGenerator="wiselyKeyGenerator",value="12213213")
	@ApiOperation(value = "获取temp详细信息", notes = "根据url的id来获取temp详细信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public JSONObject getUser(@PathVariable String id) {
		
		if(Objects.isNull(id)){
			return ResultValue.paramNonNull();
		}
		return ResultValue.success();
	}

	@ApiOperation(value = "更新temp详细信息", notes = "根据url的id来指定更新temp对象，并根据传过来的user信息来更新用户详细信息")
	@RequestMapping( method = RequestMethod.PUT)
	public JSONObject putUser(@RequestBody Object user) {
		if(Objects.isNull(user)){
			return ResultValue.paramNonNull();
		}
		return ResultValue.success();
	}

	@ApiOperation(value = "删除用户", notes = "根据url的tempId来指定删除对象")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public JSONObject deleteUser(@PathVariable String id) {
		if(Objects.isNull(id)){
			return ResultValue.paramNonNull();
		}
		return ResultValue.success();
	}

}