package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.entity.Entityclass;
import com.crud.demo.repositorty.Studentrepository;


@RestController
public class Controller {
	
	@Autowired
	private Studentrepository studentrepository;
	
	@GetMapping("/welcome")
	public String index() {
		return "welcome to crud application";
	}
	@PostMapping("/save")
	public Entityclass saveData(@RequestBody Entityclass entityclass) {
		studentrepository.save(entityclass);
		return entityclass;
	}
	@GetMapping("/showall")
	public List<Entityclass> getAll(){
		 List<Entityclass> entityList=studentrepository.findAll();
		 return entityList;
	}
	
	@DeleteMapping("/delete/{rollno}")
	public String deleteStudent(@PathVariable int rollno) {
		 Entityclass entity =studentrepository.findById(rollno).get();
		 if(entity!=null)
		 
			 studentrepository.delete(entity);
		return "studnet delete successfull";
		 
	}
	@PutMapping("/updatedata")
	public Entityclass updateData(@RequestBody Entityclass entityclass) {
		studentrepository.save(entityclass);
		return entityclass;	
	}
}
