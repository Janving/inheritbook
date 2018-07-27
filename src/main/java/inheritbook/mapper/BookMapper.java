package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.Book;

@Mapper
public interface BookMapper {

	int add(Book book);
	void update(Book book);
	void delete(Book book);
	List<Book> getBookByCourse(int courseid);
	Book getaBookById(int id);
}
