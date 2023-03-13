package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@org.springframework.stereotype.Controller
public class Controller {

	
//ye controller ese banaya tha chal table bani ya nahi dekhne ke lye;	
//	@Autowired
//	private UserRepository userrepository;
//	@GetMapping("/test")
//	@ResponseBody
//	public String test()
//	{
//		
//		User user=new User();
//		user.setName("vikas12");
//		user.setEmail("vikasrajput02368@gmail12.com");
//		userrepository.save(user);
//		return "WORKING";
//	}
	
	

	@GetMapping("/home")
    public String test(Model model) {
	   model.addAttribute("title", "Home-smart Contact");
		
		return "home";
	}
	
	

	@GetMapping("/signup")
    public String signup(Model model) {
	   model.addAttribute("title", "Register-smart contact");
		
		return "signup";
	}
	
	
	
@GetMapping("about")
public String about()
{
	return "about";
}
}
