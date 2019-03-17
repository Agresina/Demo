package hello;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SonarService {
	
	String ncloc_uri = "http://192.168.56.101:32768/api/measures/component?metricKeys=ncloc&componentKey=com.example:demo";
	
	public Metric getNcloc() {
		RestTemplate rt = new RestTemplate();
		
		Metric metric = rt.getForObject(ncloc_uri, Metric.class);
		
		return metric;
	}

}
