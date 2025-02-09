package com.Resume;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Resume.Service.ResumeService;

@SpringBootTest
class ResumeAiApplicationTests {

	@Autowired
	private ResumeService resumeService;
	
	
	@Test
	void contextLoads() throws IOException {
		
		resumeService.generateResumeResponse (" joyson 2 year experience");
	}

}
