package inheritbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inheritbook.mapper.UserMapper;
import inheritbook.pojo.User;
import inheritbook.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired UserMapper usermapper;
	public List<User> findAllUsers() {
		
		return usermapper.findAllUsers();
	}

}
