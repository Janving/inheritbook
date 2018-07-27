package inheritbook.pojo;
/**
 * 教师，依赖于课程，现实中一个教师可能有数个实例
 * @author Janving
 *
 * 2018年7月27日-上午10:38:26
 */
public class Teacher extends AbstractPojo {

	private int teacherid;
	private String teachername;
	//难度打分
	private float difficulty;
	//难度打分总数
	private int difficulty_num;
	//给分高低
	private float score;
	//给分打分人数
	private float score_num;
	//课程
	private int courseid;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public float getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(float difficulty) {
		this.difficulty = difficulty;
	}
	public int getDifficulty_num() {
		return difficulty_num;
	}
	public void setDifficulty_num(int difficulty_num) {
		this.difficulty_num = difficulty_num;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public float getScore_num() {
		return score_num;
	}
	public void setScore_num(float score_num) {
		this.score_num = score_num;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	
	
}
