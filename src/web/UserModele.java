package web;

import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserModele {
	List<User> users = new ArrayList<>();
	
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
