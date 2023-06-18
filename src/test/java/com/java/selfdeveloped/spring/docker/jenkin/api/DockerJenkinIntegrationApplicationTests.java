package com.java.selfdeveloped.spring.docker.jenkin.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerJenkinIntegrationApplicationTests {
	Logger log=LoggerFactory.getLogger(DockerJenkinIntegrationApplication.class);
	@Test
	void contextLoads() {
		log.info("log started");
		assertThat("my log executing here"); 
	}

}
