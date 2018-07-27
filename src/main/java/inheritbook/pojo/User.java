package inheritbook.pojo;
/**
 * 用户
 * @author Janving
 *
 * 2018年7月25日-上午11:10:50
 */
public class User extends AbstractPojo{

	private String password;
	private String email;
	private String phone;
	private int roleid;
	private int majorid;
	private int age;
	private int id;
	private String name;
	
	//注册识别码
	private String eid;
	
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [password=" + password + ", email=" + email + ", phone=" + phone + ", roleid=" + roleid
				+ ", majorid=" + majorid + ", age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
