package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.College;

@Mapper
public interface CollegeMapper {

	List<College> getCollegeBySchool(int schoolid);
}
