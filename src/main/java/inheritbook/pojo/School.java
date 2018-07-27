package inheritbook.pojo;
/**
 * 学校
 * @author Janving
 *
 * 2018年7月27日-上午11:34:21
 */
public class School extends AbstractPojo {

	private int schoolid;
	private String schoolname;
	private String localtion;
	public int getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

	
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getLocaltion() {
		return localtion;
	}
	public void setLocaltion(String localtion) {
		this.localtion = localtion;
	}
	
	
}
