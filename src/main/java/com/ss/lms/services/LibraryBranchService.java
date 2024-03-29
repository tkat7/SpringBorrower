package com.ss.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.lms.dao.*;
import com.ss.lms.model.*;

@Service
public class LibraryBranchService {

	@Autowired
	private LibraryBranchRepository branchRepo;
	
	
	public List<LibraryBranch> findAll()  {
		return branchRepo.findAll();
	}
}
