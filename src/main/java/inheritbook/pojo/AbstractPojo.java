package inheritbook.pojo;

import java.util.Date;

/**
 * 所有实体类的抽象类
 * @author Janving
 *
 * 2018年7月25日-上午11:07:00
 */
public class AbstractPojo {


	private Date updatetime;
	private Date createtime;
	
	private int id;
	private String name;
	
    
	
	
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
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
	
}
