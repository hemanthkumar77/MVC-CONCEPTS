package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.student;

@Controller
@RequestMapping("/")
public class control {
@RequestMapping(value="/",method=RequestMethod.GET)
public String message(Model mod)
{
	mod.addAttribute("stud",new student());
	return "index";
}
@RequestMapping(value="/display",method=RequestMethod.POST)
public ModelAndView message2(@ModelAttribute("stud") student stud)
{
	ModelAndView mav=new ModelAndView("welcome");
	mav.addObject("stud",stud);
	return mav;
}
}
