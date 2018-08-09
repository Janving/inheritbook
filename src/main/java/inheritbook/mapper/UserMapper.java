package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import inheritbook.pojo.User;



@Mapper

public interface UserMapper {


	List<User> findAllUsers();
	
	User getAUser(User user);
	
	int register(User user);
	
	
	void update(User user);
	
	int updatepassword(User user);

	void delete(User user);
}
