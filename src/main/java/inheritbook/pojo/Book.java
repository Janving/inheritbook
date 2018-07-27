package inheritbook.pojo;


/**
 * 书本
 * @author Janving
 *
 * 2018年7月27日-上午10:11:07
 */
public class Book extends AbstractPojo{

	private String bookname;
	//主键
	private int bookid;
	//专业ID
	private int majorid;
	//描述
	private String description;
	//版本
	private String version;
	//作者
	private String author;
	//出版社
	private String publisher;
	//图片
	private String pic;
	//打分人数
	private int scorenum;
	//评分
	private float score;
	//课程
	private int course_id;
	//书本状态，闲置，预定，下架
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getScorenum() {
		return scorenum;
	}
	public void setScorenum(int scorenum) {
		this.scorenum = scorenum;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	
	
}
