package project.service;

import project.po.User;

public interface UserService {

	void insert(User user);
	
	void delete(int id);
	
	void update(User user);
	
	User findUserById(int id);
}
