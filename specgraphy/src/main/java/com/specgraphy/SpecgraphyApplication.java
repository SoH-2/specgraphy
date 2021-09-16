package com.specgraphy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class SpecgraphyApplication {
	
	@RequestMapping("/")
	String home() {
		return "Spring Is Comming!";
	}
	
	@RequestMapping("/index")
	ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/getIndex")
	ModelAndView getIndex(@RequestParam(value = "test") String test) {
		ModelAndView mav = new ModelAndView("getIndex");
		mav.addObject("test", test);
		return mav;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpecgraphyApplication.class, args);
	}
	

	
	
}
