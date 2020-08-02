package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.student;

@Controller
@RequestMapping("/")
public class control {
@RequestMapping(value="/",method=RequestMethod.GET)
public String value(Model mod)
{
	mod.addAttribute("stud",new student());
	return "register";
}
@RequestMapping(value="/confirmation", method=RequestMethod.POST)
public ModelAndView response(@Valid @ModelAttribute("stud") student stud, BindingResult result,ModelAndView mav )
{
	if(result.hasErrors())
	{
	mav.setViewName("register");
	}
	else
	{	
     mav.setViewName("success");
	 mav.addObject("stud",stud);
	}
	return mav;
}
}
