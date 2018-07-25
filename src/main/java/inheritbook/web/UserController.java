package inheritbook.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
