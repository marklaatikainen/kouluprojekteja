package fi.haagahelia.teknologiat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/")
	public @ResponseBody String helloWorld() {
		
		return "Hello Spring";
	}
	
	@RequestMapping("/hello")
	public @ResponseBody String hello(@RequestParam("location") String location, @RequestParam("name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}

}