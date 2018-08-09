package inheritbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import inheritbook.mapper.UserMapper;
import inheritbook.pojo.User;
import inheritbook.service.UserService;

/**
 * 
 * @author Janving
 *
 * 2018年7月26日-上午10:53:57
 */
@Service

public class UserServiceImpl implements UserService {
	@Autowired UserMapper usermapper;
	
	@Cacheable(value="users", key="#id")
	public List<User> findAllUsers() {
		
		return usermapper.findAllUsers();
	}
	
	@Override
	public User login(User user) {
		
		User dbuser=usermapper.getAUser(user);
        if(dbuser==null) {
        	return null;
        }
	    
		if(user.getPassword().equals(dbuser.getPassword())) {
			System.out.println("password correct");
			return dbuser;
		}
		
		return null;
	}
	
	public int register(User user) {
		
		int i=usermapper.register(user);
		return i;
		
	}

	@Override
	public boolean exit(String username) {
		boolean b=false;
		User user= new User();
		user.setName(username);
		
		User nuser=usermapper.getAUser(user);
		if(nuser!=null) {
			b=true;
		}
		return b;
	}

	@Override
	public void update(User user) {
		
		usermapper.update(user);
		
	}

	@Override
	public void delete(User user) {
		usermapper.delete(user);
	}

}
