package pl.teardrop.idp_backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
@Slf4j
public class RandomValueController {

	@GetMapping("/value")
	public String getValue() {
		long value = new Random().nextLong();
		log.info("Generated value: {}", value);
		return String.valueOf(value);
	}
}
