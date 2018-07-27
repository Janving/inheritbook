package inheritbook.pojo;

/**
 * 
 * @author Janving
 *
 * 2018年7月27日-上午10:31:23
 */
public class Major extends AbstractPojo{

	private int majorid;
	private String majorname;
	private int collegeid;
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public String getMajorname() {
		return majorname;
	}
	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	
	
}
