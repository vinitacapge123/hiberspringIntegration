package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NormalController {

	@RequestMapping("/index")
	public String getIndexPage(){

		return "index";
	}
	ModelAndView mv=null;
	@RequestMapping("/home")
	public ModelAndView getHome(){
		//request
		//mv=new ModelAndView("home", "data", "hi hello!!!");
		mv=new ModelAndView("home");
		String data1="IOC , DI";
		String data2="welocme to spring!!!";
		mv.addObject("data",data1);
		mv.addObject("data2",data2);
		return mv;
	}
	/*@RequestMapping("/home")
	public String getHome(Model m){
		//request
		m.addAttribute("data", "welcome to spring!!!");
		m.addAttribute("data2", "IOC");
		return "home";
	}*/
	
/*	@RequestMapping(value="register",method=RequestMethod.GET)
	public String registerUser(Model m,@RequestParam("name") String name,@RequestParam("mobile") String mob,@RequestParam("mail") String mail){
		//data carried in request scope
		m.addAttribute("userN",name);
		m.addAttribute("userMail",mail);
		m.addAttribute("userMob",mob);
		return "registersuccess";
	}
	*/
	@RequestMapping("registerpage")
	public String getRegisterPage(Model m){
		Customer cust=new Customer();
		m.addAttribute("customerObj",cust);
		return "register";
		
	}
	@RequestMapping("registercust")
	public String registerCust(Model m,@ModelAttribute("customerObj") Customer customer){
		m.addAttribute("cObj",customer);
		
		return "registersuccess";
	}
	
	
	
	
	
	
	
}
