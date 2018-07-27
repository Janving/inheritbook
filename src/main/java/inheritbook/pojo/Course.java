package inheritbook.pojo;

import java.util.List;

/**
 * 课程
 * @author Janving
 *
 * 2018年7月27日-上午10:35:55
 */

public class Course extends AbstractPojo{

	private int courseid;
	private String coursename;
	//描述
	private String description;
	//专业id
	private int majorid;
	//课程类型
	private Coursetype coursetype;
	//学期 1--8
	private int semester;
	//老师
	private List<Teacher> teachers;
	
	
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public Coursetype getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(Coursetype coursetype) {
		this.coursetype = coursetype;
	}
	
	
}
