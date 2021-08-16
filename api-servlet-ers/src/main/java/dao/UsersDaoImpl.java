package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.Users;
import common.util.DBUtil;

public class UsersDaoImpl implements UsersDao {

	public UsersDaoImpl() {
	}

	@Override
	public void create(Users user) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();
	}

	@Override
	public Users getUser(String email, String password) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Users where email = :uname and password = :pswd");
		query.setString("uname", email);
		query.setString("pswd", password);

		Users user = (Users) query.uniqueResult();

		session.close();
		return user;
	}

}
