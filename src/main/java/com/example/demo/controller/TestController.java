package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkin")
public class TestController {

	@GetMapping("/getCarList")
	private ResponseEntity<?> getCarList(){
		List<String> carList = new ArrayList<>();
		carList.add("BMW");
		carList.add("Mercedes");
		return new ResponseEntity<>(carList,HttpStatus.OK);
	}
	
	@GetMapping("/getFruitList")
	private ResponseEntity<?> getFruitList(){
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Orange");
		return new ResponseEntity<>(fruitList,HttpStatus.OK);
	}
	
	@GetMapping("/getVegList")
	private ResponseEntity<?> getVegList(){
		List<String> vegList = new ArrayList<>();
		vegList.add("Potato");
		vegList.add("Tomato");
		return new ResponseEntity<>(vegList,HttpStatus.OK);
	}
}
