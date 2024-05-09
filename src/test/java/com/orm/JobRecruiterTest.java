//package com.orm;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.orm.controller.JobRecruiterController;
//import com.orm.entity.JobRecruiter;
//
//@SpringBootTest
//class JobRecruiterTest {
//	
//	@Test
//	void contextLoads() {
//	}
//	
//	@Autowired
//	private JobRecruiterController jobRecruiter;
//	
//	void createJobRecruiter()
//	{
//		JobRecruiter jobRecruit = new JobRecruiter();
//		
//		jobRecruit.setProviderId(1);
//		jobRecruit.setCompanyName("Tata");
//		jobRecruit.setEligibilityCriteria("Should be have +2 years exp and master degree in data science");
//		jobRecruit.setProviderName("John");
//		jobRecruit.setRoleId(203);
//		jobRecruit.setRoleName("Full stack dev");
//		
//		String result = jobRecruiter.createJobRecruiter(jobRecruit);
//		assertNotNull(result);	
//	}
//	
//	@Test
//	void getAllJobRecruiter() {
//		  List<JobRecruiter> jobRecruit=jobRecruiter.getAllJobRecruiter();
//		  System.out.println(jobRecruit);
//          assertNotNull(jobRecruit);
//	}
//	
//}
//
