package com.study.service;

import com.study.dto.Users;

public interface SigninService {
	public Users signin(int userNo, String password);
}
