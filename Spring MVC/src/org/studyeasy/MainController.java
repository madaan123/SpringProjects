package org.studyeasy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hello() {
		return "Hello";
	}
	
	@RequestMapping("displayname")
	public String displayName(@RequestParam("firstName") String firstName, Model model) {
		Date date = new Date();
		
		List<String> names = new ArrayList<>();
		names.add("Ashish");
		names.add("Rohan");
		names.add("Sam");
		
		model.addAttribute("date",date);
		model.addAttribute("name",firstName);
		model.addAttribute("employees",names);
		//request.setAttribute("firstName", firstName);
		return "displayName";
	}
}
