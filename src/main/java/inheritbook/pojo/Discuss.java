package inheritbook.pojo;
/**
 * 讨论
 * @author Janving
 *
 * 2018年7月27日-上午10:42:02
 */
public class Discuss extends AbstractPojo {

	private int discussid;
	//讨论内容
	private String comment;
	//回复信息的id
	private int parent_id;
	//是否显示
	private boolean display;
	//讨论者id
	private int userid;
	//所在课程
	private int courseid;
	//所在书本
	private int bookid;
	//回复的人的id
	private int parentuserid;
	//回复的人的姓名
	private String parentusername;
	
	
	
	public String getParentusername() {
		return parentusername;
	}
	public void setParentusername(String parentusername) {
		this.parentusername = parentusername;
	}
	public int getDiscussid() {
		return discussid;
	}
	public void setDiscussid(int discussid) {
		this.discussid = discussid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public boolean isDisplay() {
		return display;
	}
	public void setDisplay(boolean display) {
		this.display = display;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getParentuserid() {
		return parentuserid;
	}
	public void setParentuserid(int parentuserid) {
		this.parentuserid = parentuserid;
	}
	
	
	
}
