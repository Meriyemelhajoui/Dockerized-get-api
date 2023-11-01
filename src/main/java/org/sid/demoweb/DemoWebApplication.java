package org.sid.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
	@GetMapping("/test")
	public Map<String , Object> test(){
		Map<String,Object> data = new HashMap<>();
		data.put("name","From Docker");
		data.put("counter",220);
		return data;
	}

}
