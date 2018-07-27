package inheritbook.pojo;

/**
 * 学院
 * @author Janving
 *
 * 2018年7月27日-上午10:28:08
 */
public class College extends AbstractPojo{

	private int collegeid;
	private int collegename;
	private int schoolid;
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public int getCollegename() {
		return collegename;
	}
	public void setCollegename(int collegename) {
		this.collegename = collegename;
	}
	public int getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}
	
	
}
