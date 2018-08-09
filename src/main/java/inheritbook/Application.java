package inheritbook;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
/*
 * springboot启动
 */

@SpringBootApplication

public class Application {
	
	public static void main(String[] args) {
		    
		 SpringApplication.run(Application.class, args);

	}

}
