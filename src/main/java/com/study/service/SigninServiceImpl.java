package com.study.service;

import com.study.dao.UsersMapper;
import com.study.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninServiceImpl implements SigninService{
	@Autowired
	UsersMapper usersDao;
	
	@Override
	public Users signin(int userNo, String password) {
		return usersDao.signin(userNo, password);
	}
	

}
