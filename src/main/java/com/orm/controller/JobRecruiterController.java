package com.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orm.entity.JobRecruiter;
import com.orm.repo.JobRecruiterRepo;



@RestController 
@CrossOrigin("http://localhost:3000")
public class JobRecruiterController {
	@Autowired
	JobRecruiterRepo repo;
	
	@PostMapping("/CreateJobRecruiter")
	public String createJobRecruiter(@RequestBody JobRecruiter jobRecruiter) {

		String msg = " ";
		try {
			repo.save(jobRecruiter);
			msg = " Object Saved";
		} catch (Exception e) {
			msg = " Object Not Saved";
		}
		return msg;
	}
	
	@GetMapping("/GetJobRecruiterById/{providerId}")
	public JobRecruiter getJobRecruiterById(@PathVariable("providerId")int providerId) {
		JobRecruiter recruiter = repo.findById(providerId).get();	
		
		return recruiter;
	}
	
	@GetMapping("getJobRecruiterIdList")
	List<Integer> getIdListtt(){
		List<Integer> list=repo.getIdList();
		return list;
		
	}
	
	@GetMapping("getAllDetailsOwner")
	public
	List<JobRecruiter> getAllJobRecruiter() {		
		List<JobRecruiter>  jobRecruiter=repo.findAll();		
		return jobRecruiter;
	}
	
	@GetMapping("getJobRecruiterNameList")
	List<String> getNameListtt(){
		List<String> name=repo.getNameList();
		return name;
	}
	
	@GetMapping("getJobRoleNameList")
	List<String> getNameListt()
	{
		List<String> roleName=repo.getNameListt();
		return roleName;
	}
	
	
	@DeleteMapping("deleteJobRecruiterById/{providerId}")
	public String deleteJobRecruiter(@PathVariable("providerId")int providerId) {		
		String msg = " ";
		try {
			repo.deleteById(providerId);		   
			msg = "delete!!!!";
		} catch (Exception e) {
			msg = "delete Fail!!!!";
		}
		return msg;		
	}
	
	@PutMapping("/UpdateJobRecruiter")
	public String updateJobRecruiter(@RequestBody JobRecruiter jobRecruiter) {

		String msg = " ";
		try {
			repo.save(jobRecruiter);
			msg = " Object Saved";
		} catch (Exception e) {
			msg = " Object Not Saved";
		}
		return msg;

	}
}
