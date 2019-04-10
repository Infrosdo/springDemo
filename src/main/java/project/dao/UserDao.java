package project.dao;

import project.po.User;

public interface UserDao {

	void insert(User user);
	
	void delete(int id);
	
	void update(User user);
	
	User findUserById(int id);
}
