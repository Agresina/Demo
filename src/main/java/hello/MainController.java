package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	SonarService sonarService;
	
	@RequestMapping("/")
	public String index() {
		Metric metric = sonarService.getNcloc();
		return metric.toString();
	}

}
