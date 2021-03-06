package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.TestProp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TestProp testProp;
	
	@Test
	public void contextLoads() {
		logger.info(testProp.toString());
	}

}
