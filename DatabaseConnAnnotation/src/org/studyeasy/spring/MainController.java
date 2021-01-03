package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
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
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		modelAndView.addObject("users",users);
		context.close();
		
		return modelAndView;
	}
	
}
