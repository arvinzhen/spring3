package top.liqx.java.study.spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Properties;

/**
 * @author wshao
 */
@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {

		Properties properties = System.getProperties();
		Map<String, String> getenv = System.getenv();
		SpringApplication.run(Spring3Application.class, args);
	}

}