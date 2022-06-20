package dao;

import java.util.List;

import entity.User;

public interface IUserDao {
	public User save(User u);
	public List<User> usersParMC(String mc);
	public User getUser(Long id);
	public User updateUser(User p);
	public void deleteUser(Long id);
	}
