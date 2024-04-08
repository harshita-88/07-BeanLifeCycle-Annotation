package in.harshita;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	@PostConstruct
	public void init() {
		System.out.println("Class object Initializing");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Class object destroying");
	}

	public void getData() {
		System.out.println("Getting Data");
	}
}
