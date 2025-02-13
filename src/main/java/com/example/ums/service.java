package com.example.ums;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	
	@Autowired
	Repository repo;
	
	public List<Users> getUsers(){
		return repo.findAll();
	}
	
	public Users postData(Users data) {
		return repo.save(data);
	}
	
	public Users getUserById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteData(int id) {
		repo.deleteById(id);
	}
	
	public Users updateUser(int id,Users userData) {
		if(repo.existsById(id)) {
			Users existingUser = repo.findById(id).orElse(null);
            if (existingUser != null) {
                // Update the fields
                existingUser.setName(userData.getName());
                existingUser.setEmail(userData.getEmail());
                existingUser.setAge(userData.getAge());
                existingUser.setGender(userData.getGender());
                
                return repo.save(existingUser);
            } else {
                return null;
            }
        } else {
            return null;
		}
	}
	
	
}
