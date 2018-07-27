package inheritbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
