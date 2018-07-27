package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import inheritbook.pojo.Discuss;

@Mapper
public interface DiscussMapper {

	int add(Discuss discuss);

	//void delete(Discuss discuss);
	//评论不能被真正地删除，只能被隐藏
	void hide(Discuss discuss);
	List<Discuss> getDiscussOnBook(int bookid);
	void getDiscussOnCourse(int courseid);
}
