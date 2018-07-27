package inheritbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import inheritbook.pojo.Major;

@Mapper
public interface MajorMapper {

	List<Major> getMajorByCollege(int collegeid);
}
