package com.bayram.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bayram.model.User;
import com.bayram.valitador.UserValidator;
@Controller
public class HomeController {
	
	
	@Autowired
	private UserValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
		
	}
	@RequestMapping("/")
	public ModelAndView gitUsergiriþ() {
		
		return new ModelAndView("index", "user", new User());
	}
	
	@RequestMapping(value = "/welcome",method = RequestMethod.POST)
	public ModelAndView gitWelcome(@Validated @ModelAttribute("user") User user,  BindingResult result) {
		System.out.println("Validater: "+ validator);
		
		boolean error = false;
		     
		if (user.getFirstname().isEmpty()) {
			result.rejectValue("firstname", "errors.firstname");
			error = true;
		}
		if (user.getLastname().isEmpty()) {
			result.rejectValue("lastname", "errors.lastname");
			error = true;
		}
		if (user.getAge() < 0) {
			result.rejectValue("age", "errors.age");
			error = true;
		}

		if(error) {
			System.out.println("Hatalar Var: "+ result.getAllErrors());
			return new ModelAndView("index", "user", new User());
		}
		
		return new ModelAndView("welcome", "user", user);
	}
	
	
	
	
	
	
	/*
	
	
	
	@RequestMapping(value = "/welcome",method = RequestMethod.POST)
	public ModelAndView gitWelcome(@Validated @ModelAttribute("user") User user,  BindingResult result) {
		System.out.println("Validater: "+ validator);
		
		if(result.hasErrors()) {
			result.reject("firstname", "errors.firstname");
			System.out.println("Hatalar Var: "+ result.getAllErrors());
			return new ModelAndView("index", "user", new User());
		}
		
		return new ModelAndView("welcome", "user", user);
	}
	*/
	/*
	  boolean error = false;
     
    System.out.println(employeeVO); //Verifying if information is same as input by user
     
    if(employeeVO.getFirstName().isEmpty()){
        result.rejectValue("firstName", "error.firstName");
        error = true;
    }
     
    if(employeeVO.getLastName().isEmpty()){
        result.rejectValue("lastName", "error.lastName");
        error = true;
    }
     
    if(employeeVO.getEmail().isEmpty()){
        result.rejectValue("email", "error.email");
        error = true;
    }
     
    if(error) {
        return "addEmployee";
    }
    //validation code ends
     
    //Store the employee information in database
    //manager.createNewRecord(employeeVO);
     
    //Mark Session Complete
    status.setComplete();
    return "redirect:addNew/success";*/
	
}
