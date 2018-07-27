package inheritbook.mapper;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.Teacher;

@Mapper
public interface TeacherMapper {

	void add(Teacher teacher);
	
	void delete(Teacher teacher);
	
	Teacher getTeacherByCourse(int courseid);
}
