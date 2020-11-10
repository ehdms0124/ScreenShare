package com.study.service;

import com.study.dto.Users;

public interface SignupService {
	public Users getUsersbyNick(String nick);
	public Users getUsersbyUserId(int userId);
	public void registUser(Users user);
}
