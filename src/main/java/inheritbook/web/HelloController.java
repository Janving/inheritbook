package inheritbook.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
    private StringRedisTemplate stringRedisTemplate;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping("/redisHandler")
    public String redisHandler(){
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        return stringRedisTemplate.opsForValue().get("k5");
    }
	
}
