package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import inheritbook.pojo.Book;

@Mapper
@CacheConfig(cacheNames = "book")
public interface BookMapper {

	int add(Book book);
	
	@CachePut(key = "#p0")
	void update(Book book);
	
	@CacheEvict(key ="#p0",allEntries=true)
	void delete(Book book);
	
	@Cacheable(key ="#p0") 
	List<Book> getBookByCourse(int courseid);
	
	@Cacheable(key ="#p0") 
	Book getaBookById(int id);
}
