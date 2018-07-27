package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.School;

@Mapper
public interface SchoolMapper {

	List<School> findAllSchools();
	
	
}
