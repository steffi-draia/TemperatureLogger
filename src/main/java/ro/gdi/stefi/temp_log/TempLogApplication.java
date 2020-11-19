package ro.gdi.stefi.temp_log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TempLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempLogApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
