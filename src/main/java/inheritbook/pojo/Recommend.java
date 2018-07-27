package inheritbook.pojo;

/**
 * 主页，推荐的课程或书本连接
 * @author Janving
 *
 * 2018年7月27日-上午10:51:25
 */
public class Recommend extends AbstractPojo {

	//类型，书本还是课程
	private String type;
	//书本或课程的id
	private int id;
	//连接
	private String url;
	//描述
	private String description;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
