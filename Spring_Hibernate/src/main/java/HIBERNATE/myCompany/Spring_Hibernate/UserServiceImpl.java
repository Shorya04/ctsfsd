package HIBERNATE.myCompany.Spring_Hibernate;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import HIBERNATE.myCompany.Spring_Hibernate.Entity.User;

@Service("service")
public class UserServiceImpl implements UserService {
	
	UserDao userDao;

	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	@Transactional
	public User createUserDetails(User user) {
		// TODO Auto-generated method stub
		return userDao.createUserDetails(user);
	}

}
