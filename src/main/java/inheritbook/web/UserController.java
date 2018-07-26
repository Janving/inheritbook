package inheritbook.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import inheritbook.pojo.User;
import inheritbook.service.UserService;



@RestController
public class UserController {
    @Autowired
	private UserService userservice;
	
	@RequestMapping("/findAllUsers")
	public List<User> findAllUsers() {

		return userservice.findAllUsers();
	}
	
	@RequestMapping("/login")
	public User login(@RequestBody User user) throws IOException {
		User dbuser=userservice.login(user);
		
		return  dbuser;
		
	}
}
