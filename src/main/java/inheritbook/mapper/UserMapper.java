package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.User;



@Mapper
public interface UserMapper {

	List<User> findAllUsers();
	
	User getAUser(User user);
	
	int register(User user);
}
