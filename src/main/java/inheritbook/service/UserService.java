package inheritbook.service;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import inheritbook.pojo.User;
/**
 * 
 * @author Janving
 *
 * 2018年7月25日-下午2:48:18
 */

public interface UserService {
//列出所有用户

	List<User> findAllUsers();
//用户登录验证	
	User login(User user);
//用户注册	
	int register(User user);
	
	//是否存在一个用户
	boolean exit(String username);
	
	//修改用户

	void update(User user);
	
	//删除用户
	void delete(User user);
	
}
