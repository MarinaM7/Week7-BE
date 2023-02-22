package com.marina.Giorno2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marina.Giorno2.entities.Person;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/data1")
	public String response() {
		return "response";
	}
	
	@GetMapping("/data2")
	public String people() {
		
		Person p1 = new Person("Marina", 20, "Padova");
		Person p2 = new Person("Giacomo", 30, "Milano");
		Person p3 = new Person("Anna", 16, "Torino");
		Person p4 = new Person("Luigi", 24, "Bologna");
		
		List<Person> p = new ArrayList<>() {{
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			}};
			
		return "Lista sotto forma di stringa: " + p.toString();
	}
	
	@RequestMapping(value = "/data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> arrayList() {
		
		Person p1 = new Person("Marina", 20, "Padova");
		Person p2 = new Person("Giacomo", 30, "Milano");
		Person p3 = new Person("Anna", 16, "Torino");
		Person p4 = new Person("Luigi", 24, "Bologna");
		
		List<Person> p = new ArrayList<>() {{
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			}};
			
		return p;
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
}
