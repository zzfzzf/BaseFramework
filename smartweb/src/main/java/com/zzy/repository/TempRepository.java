package com.zzy.repository;
import org.springframework.data.repository.CrudRepository;

import com.zzy.model.User;

/** 
* @author zero
* @version 1.0.0
* @date:2016年4月1日
* @description:
*/
public interface TempRepository extends CrudRepository<User, String>{
	
}
