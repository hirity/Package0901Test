package org.fintech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/exam/*")
@AllArgsConstructor
@Log4j
public class ExamController {
	
	@GetMapping("/test1")
	public void test1() {
		log.info("exam test1 page");
		
	}
	
	@GetMapping("/test2")
	public void test2() {
		log.info("exam test2 page");
		
	}
	
	@GetMapping("/test3")
	public void test3() {
		log.info("exam test3 page");
		
	}
	
}
