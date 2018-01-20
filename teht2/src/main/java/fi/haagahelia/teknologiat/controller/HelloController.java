package fi.haagahelia.teknologiat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(@RequestParam("name") String name, @RequestParam("age") String age, Model model) {
		model.addAttribute("name", name);
		int ageNum = new Integer(age);
		model.addAttribute("age", ageNum);
		return "hello";
	}
}
