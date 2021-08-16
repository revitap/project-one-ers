package manager;

import common.model.Users;
import dao.UsersDao;
import dao.UsersDaoImpl;
import dao.UsersDao;

public class UsersManager {
	
	UsersDao dao = new UsersDaoImpl();

	public UsersManager() {}
	
	public void create(Users user) {
		dao.create(user);
	}
	
	public boolean login(String email, String password) {
		if(dao.getUser(email, password) != null) {
			return true;
		}
		return false;
	}

}
