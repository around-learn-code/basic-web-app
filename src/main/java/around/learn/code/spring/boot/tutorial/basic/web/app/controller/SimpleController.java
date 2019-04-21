package around.learn.code.spring.boot.tutorial.basic.web.app.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleController {
	@PostMapping(value = "/sum", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Double sum(@RequestBody List<Double> members) {
		return members.stream().mapToDouble(Double::doubleValue).sum();
	}
}
