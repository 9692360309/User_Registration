package com.regst.service;

import java.util.List;

import com.regst.entity.User;

public interface UserService {

	User createUser(User user);

	User updateUser(Long id, User user);

	void deleteUser(Long id);

	User getUserById(Long id);

	List<User> getAllUsers();
	void updateUserStatus(Long id, boolean active);
}
