package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
//	@Autowired
//	private SonarService sonarService;
//	
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
//			
//			Metric metric = sonarService.getNcloc();
//			log.info(metric.toString());
//		};
//	}
}