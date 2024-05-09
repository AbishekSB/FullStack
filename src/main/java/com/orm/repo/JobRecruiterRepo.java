package com.orm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orm.entity.JobRecruiter;

public interface JobRecruiterRepo extends JpaRepository<JobRecruiter, Integer>{
	@Query("select providerId from JobRecruiter order by providerId")
	public List<Integer> getIdList();
	
	@Query("select providerName from JobRecruiter order by providerName")
	public List<String> getNameList();
	
	@Query("select roleName from JobRecruiter order by roleName")
	public List<String> getNameListt();

}
