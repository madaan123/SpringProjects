package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.spring.DAO.AppDAOImpl;
import org.studyeasy.spring.config.AppConfig;
import org.studyeasy.spring.model.User_DB;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Hello() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<User_DB> users = new ArrayList<User_DB>();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		modelAndView.addObject("users", users);
		context.close();

		return modelAndView;
	}

	@RequestMapping(value = "/addUser")
	public ModelAndView addUser(@ModelAttribute("user") @Valid User_DB user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("addUser");
		modelAndView.addObject("user", user);

		if (result.hasErrors()) {
			System.out.println("has errors");
			return modelAndView;
		} else {
			if (user.getFirst_name() != null && user.getPassword() != null) {
				System.out.println("Submitting user info" + user);
				ModelAndView modelAndViewAfter = new ModelAndView("index");
				List<User_DB> users = new ArrayList<User_DB>();

				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

				AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
				DAO.addUser(user);
				users = DAO.listUsers();
				modelAndViewAfter.addObject("users", users);
				context.close();
				return modelAndViewAfter;
			} else {
				System.out.println("Loading form");
				return modelAndView;
			}
		}
	}
}
