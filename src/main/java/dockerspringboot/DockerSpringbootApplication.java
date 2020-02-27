package dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DockerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}
	
	@GetMapping(value = "/getmsg")
	public String getMsg() {
		return "Welcome To First Docker API";
	}

}
