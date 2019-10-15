package com.webapp.smartweb.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.webapp.smartweb.data.domain.User;
import com.webapp.smartweb.data.repository.UserRepository;
import com.webapp.smartweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAllUsers() {
		return null;
	}

	@Override
	public User findById(long id) {
		return userRepository.get(id);
	}

	@Override
	public User findByName(String name) {
		return null;
	}

	@Transactional
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Transactional
	@Override
	public void updateUser(User user) {
		userRepository.update(user.getId(), user);
	}

	@Transactional
	@Override
	public void deleteUserById(long id) {
		userRepository.delete(id);
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}

	@Override
	public void deleteAllUsers(){

	}
}
