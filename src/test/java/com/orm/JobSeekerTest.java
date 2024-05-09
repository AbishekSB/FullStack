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
//import com.orm.controller.JobSeekerController;
//import com.orm.entity.JobSeeker;
//
//
//
//@SpringBootTest
//class JobSeekerTest {
//	
//	@Test
//	void contextLoads() {
//	}
//	
//	@Autowired
//	private JobSeekerController jobSeekerController;
//	
//	void createUser()
//	{
//		JobSeeker jobSeeker = new JobSeeker();
//		
//		jobSeeker.setAge(22);
//		jobSeeker.setApplicantCity("Chennai");
//		jobSeeker.setApplicantId(1);
//		jobSeeker.setApplicantName("Abishek");
//		jobSeeker.setDegree("Btech");
//		jobSeeker.setGender("Male");
//		jobSeeker.setYearOfGraduation(2022);
//	
//		
//		String result = jobSeekerController.createUser(jobSeeker);
//		assertNotNull(result);	
//	}
//	
//	@Test
//	void getAllSeeker() {
//		  List<JobSeeker> jobSeeker=jobSeekerController.getAllSeeker();
//		  System.out.println(jobSeeker);
//          assertNotNull(jobSeeker);
//	}
//	
//}
//
//
//
//
//
