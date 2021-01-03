package org.studyeasy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Hello() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		modelAndView.addObject("user",user);
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		modelAndView.addObject("genderMap",genderMap);
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("USA", "United States");
		countryMap.put("Russia", "Russia");
		countryMap.put("Ireland", "Ireland");
		modelAndView.addObject("countryMap",countryMap);
		
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		System.out.println(user);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
}
