package inheritbook.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import inheritbook.pojo.ResultMsg;
import inheritbook.pojo.User;
import inheritbook.service.UserService;
import inheritbook.util.EmailTest;
import inheritbook.util.Randomid;

/**
 * 用户操作
 * @author Janving
 *
 * 2018年7月26日-上午10:49:37
 */

@Controller

public class UserController {
    @Autowired
	private UserService userservice;
	
    @ResponseBody
	@RequestMapping("/findAllUsers")
	public List<User> findAllUsers() {

		return userservice.findAllUsers();
	}
	/*
	 * 登陆
	 */
    @ResponseBody
	@RequestMapping("/login")
	public ResultMsg login(@RequestBody User user) throws IOException {
		User dbuser=userservice.login(user);
	
		ResultMsg resultmsg= new ResultMsg();
		resultmsg.setMsg("incrroect");
		resultmsg.setUrl("http://baidu.com");
		if(dbuser!=null){
	    resultmsg.setMsg("login");
	
		}
		
		return resultmsg;
		
	}
	
	
	@RequestMapping("/test")
	 public ModelAndView test(){
	        ModelAndView mv = new ModelAndView("login/index.html");
	        return mv;
	    }
	
	
	/*
	 * 注册
	 */
	
	@RequestMapping("/login/register")
	public ModelAndView register(String ename,String eid,HttpServletRequest request) {		
		if(ename==null||eid==null) {
			return new ModelAndView("registerfail.html");
		}
		ServletContext servletContext=request.getSession().getServletContext();
		User user= (User) servletContext.getAttribute(ename);
		
	
		if(eid.equals(user.getEid())) {
			int i=userservice.register(user);
			if(i>0) {
				return new ModelAndView("index3.html");
			}
		}
		return new ModelAndView("registerfail.html");
		
	}
	/*
	 * 注册验证
	 */
	
	@RequestMapping("/login/preregister")
	public ModelAndView preregister( User user,HttpServletRequest request) throws Exception {
		user.setEid(Randomid.randomUtil());
		ServletContext servletContext=request.getSession().getServletContext();
		String path=request.getContextPath();
	    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
	    String text="请点击以下连接来验证你的邮箱"+ basePath+"login/register?ename="+user.getName()+"&eid="+user.getEid();
		
	    servletContext.setAttribute(user.getName(), user);
	    EmailTest et= new EmailTest();
	    et.testSendEmail("验证邮箱",text,user.getEmail());

	    return new ModelAndView("/login/presuccess.html");
	   

	}
	
}
