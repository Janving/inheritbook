package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.Course;

@Mapper
public interface CourseMapper {

	List<Course> getCourseByMajor(int majorid);
	
	int add(Course course);
	
	void update(Course course);
	
	void delte(Course course);
}
