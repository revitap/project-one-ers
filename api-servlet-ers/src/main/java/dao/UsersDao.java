package dao;

import common.model.Users;

public interface UsersDao {

	public void create(Users user);
	public Users getUser(String email, String password);

}
