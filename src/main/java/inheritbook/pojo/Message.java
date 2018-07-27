package inheritbook.pojo;
/**
 * 用户消息，回复，留言
 * @author Janving
 *
 * 2018年7月27日-上午11:01:15
 */
public class Message extends AbstractPojo {

	//描述
	private String description;
	//发在哪里
	private String location;
	///连接
	private String url;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
