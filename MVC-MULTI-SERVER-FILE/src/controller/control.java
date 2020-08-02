package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ser;

@Controller
@RequestMapping("/")
public class control {
@Autowired
private ser services;	
@GetMapping("/")
public ModelAndView index()
{
	return new ModelAndView ("index","message", services.method());
}
}
