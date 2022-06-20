package metier;

import java.util.List;


import entity.User;

public interface ImetierUser {
	public List<User> getUsersParMdp(String mc);
	public void addUser(User p);
}
