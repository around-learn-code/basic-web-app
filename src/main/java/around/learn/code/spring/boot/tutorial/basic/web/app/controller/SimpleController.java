package around.learn.code.spring.boot.tutorial.basic.web.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleController {
	Logger logger = LoggerFactory.getLogger(SimpleController.class);

	@PostMapping(value = "/sum", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Double sum(@RequestBody List<Double> members) {
		return members.stream().mapToDouble(Double::doubleValue).sum();
	}

	@PostMapping(value = "/log", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void log(@RequestBody String message) {
		logger.trace("A TRACE {}", message);
        logger.debug("A DEBUG {}", message);
        logger.info("An INFO {}", message);
        logger.warn("A WARN {}", message);
        logger.error("An ERROR {}", message);
	}
}
