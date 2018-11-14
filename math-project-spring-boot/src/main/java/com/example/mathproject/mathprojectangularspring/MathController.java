package com.example.mathproject.mathprojectangularspring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@GetMapping("/add/{no1}/{no2}")
	public int add(@PathVariable int no1, @PathVariable int no2) {
		int result = no1+no2;
		return result;
	}
	
	@GetMapping("/subtract/{no1}/{no2}")
	public int subtract(@PathVariable int no1, @PathVariable int no2) {
		int result = no1-no2;
		return result;
	}
	
	@GetMapping("/multiply/{no1}/{no2}")
	public int multiply(@PathVariable int no1, @PathVariable int no2) {
		int result = no1*no2;
		return result;
	}
	
	@GetMapping("/divide/{no1}/{no2}")
	public int divide(@PathVariable int no1, @PathVariable int no2) {
		int result = no1/no2;
		return result;
	}
}
