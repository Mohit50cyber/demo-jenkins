package mohit;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class MohitJenkinsApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringApplication.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executing...........");
		logger.info("test case executing 2 log statement" );
		assertEquals(true,true);
	}



}
