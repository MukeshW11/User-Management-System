package com.example.ums;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usm")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {
	@Autowired
	private service service;
	
//	@Autowired
//	private Repository repo;
	
	@PostMapping("/add")
	public Users post(@RequestBody Users data) {
		return service.postData(data);
	}
	
	@GetMapping("/fetch")
	public List<Users> getAllUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/fetch/{id}")
	public Users getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id){
		service.deleteData(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Users> updateUser(@PathVariable int id,@RequestBody Users userDetails){
		Users updatedUser = service.updateUser(id,userDetails);
		if(updatedUser != null) {
			return ResponseEntity.ok(updatedUser);
		}
		else {
			return ResponseEntity.notFound().build();
		}

	}


}
