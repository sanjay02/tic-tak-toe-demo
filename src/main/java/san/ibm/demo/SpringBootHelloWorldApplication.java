package san.ibm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.scheduling.annotation.EnableScheduling;
import san.ibm.demo.handler.HandlerTicTakToe;


@SpringBootApplication
@EnableScheduling
public class SpringBootHelloWorldApplication  extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootHelloWorldApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);

	}

}