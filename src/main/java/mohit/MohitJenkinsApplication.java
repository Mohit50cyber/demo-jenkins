package mohit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MohitJenkinsApplication {


	public static Logger logger= LoggerFactory.getLogger(SpringApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("App started..........");
	}

	public static void main(String[] args) {
		logger.info("App executedd.................");
		SpringApplication.run(MohitJenkinsApplication.class, args);
	}

}
