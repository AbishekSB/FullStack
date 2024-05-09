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

import com.orm.entity.JobSeeker;
import com.orm.repo.JobSeekerRepo;

@RestController 
@CrossOrigin("http://localhost:3000")
public class JobSeekerController {
	
	@Autowired
	JobSeekerRepo repo;
	
	//For Inserting the User
	@PostMapping("/CreateUser")
	public String createUser(@RequestBody JobSeeker jobSeeker)
	{
		String msg =" ";
		try
		{
			repo.save(jobSeeker);
			msg =" Object saved";		
		}
		catch(Exception e)
		{
			msg = " Object not Saved";
		}
		return msg;
	}
	
	
	
	@GetMapping("/getSeekerById/{applicantId}")
	public JobSeeker getUserById(@PathVariable("applicantId") int applicantId)
	{ 
		JobSeeker seeker = repo.findById(applicantId).get();
		return seeker;
	}
	
	
	
	@DeleteMapping("deleteSeekerById/{applicantId}")
	public String deleteUser(@PathVariable("applicantId")int applicantId) {		
		String msg = " ";
		try {
			repo.deleteById(applicantId);		   
			msg = "delete!!!!";
		} catch (Exception e) {
			msg = "delete Fail!!!!";
		}
		return msg;	
	}
	

	@PutMapping("/UpdateSeeker")
	public String updateSeeker(@RequestBody JobSeeker jobSeeker) {

		String msg = " ";
		try {
			repo.save(jobSeeker);
			msg = " Object Saved";
		} catch (Exception e) {
			msg = " Object Not Saved";
		}
		return msg;

	}
	
	
	@GetMapping("getSeekerIdList")
	List<Integer> getIdListtt(){
		List<Integer> list=repo.getIdList();
		return list;
		
	}
	
	@GetMapping("getAllDetailsSeeker")
	public
	List<JobSeeker> getAllSeeker() {		
		List<JobSeeker> st=repo.findAll();		
		return st;
	}
	
	
}

