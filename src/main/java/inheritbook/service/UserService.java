package inheritbook.service;

import java.util.List;

import inheritbook.pojo.User;
/**
 * 
 * @author Janving
 *
 * 2018年7月25日-下午2:48:18
 */
public interface UserService {

	List<User> findAllUsers();
}
