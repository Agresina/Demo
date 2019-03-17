package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			
			/*String quote1 = restTemplate.getForObject(
					"https://sonarcloud.io/api/rules/show?key=squid:S1219", String.class);
			log.info(quote1);*/
			
			/*Quote quote = restTemplate.getForObject(
					"https://sonarcloud.io/api/rules/show?key=squid:S1219", Quote.class);
			log.info(quote.getRule().getKey() + " - " + quote.getRule().getName());*/
			
			Metric metric = restTemplate.getForObject(
					"https://sonarcloud.io/api/measures/component?metricKeys=ncloc&componentKey=com.example:demo", Metric.class);
			log.info(metric.getComponent().getKey() + " - " + metric.getComponent().getName() + " - " + metric.getComponent().getDescription());
		};
	}
}