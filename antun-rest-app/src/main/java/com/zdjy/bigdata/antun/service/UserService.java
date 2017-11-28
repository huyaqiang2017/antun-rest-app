package com.zdjy.bigdata.antun.service;

import java.util.List;

import com.zdjy.bigdata.antun.domain.User;
import com.zdjy.bigdata.antun.web.model.UserAdd;
import com.zdjy.bigdata.antun.web.model.UserUpdate;

public interface UserService {

	//查找全部
	List<User> findAll();
	
	int addUser(UserAdd userAdd);
	
	User getUser(Long id);

	int updateUser(Long id, UserUpdate userUpdate);

	int deleteUser(Long id);

	User findByPhone(String phone);
}
