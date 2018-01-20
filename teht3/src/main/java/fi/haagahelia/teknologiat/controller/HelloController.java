package fi.haagahelia.teknologiat.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.teknologiat.bean.Friend;
import fi.haagahelia.teknologiat.bean.Student;

import org.springframework.ui.Model;

@Controller
public class HelloController {
	List<String> frList = new ArrayList<String>();

	@RequestMapping("/hello")
	public String hello(Model model) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Kate", "Cole", ""));
		list.add(new Student("Dan", "Brown", ""));
		list.add(new Student("Mike", "Mars", ""));

		model.addAttribute("students", list);
		return "hello";
	}

	@RequestMapping("/index")
	public String index(@RequestParam(value= "friend",  defaultValue = "") String name, Model model) {
		if(name.length() > 0) {
			frList.add(name);
		}
		model.addAttribute("friends", frList);
		return "index";
	}
}
