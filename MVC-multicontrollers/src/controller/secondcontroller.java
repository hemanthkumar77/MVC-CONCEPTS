package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value="/")
public class secondcontroller {
@RequestMapping(method=RequestMethod.GET,value="/add")
public ModelAndView adduser()
{
	return new ModelAndView("add","messagename","successfully added the user");
	
}
@RequestMapping(method=RequestMethod.GET,value="/update")
public ModelAndView updateuser()
{
	return new ModelAndView("update","messagename","successfully updated the user information");
	
}
@RequestMapping(method=RequestMethod.GET,value="/delete")
public ModelAndView deleteuser()
{
	return new ModelAndView("delete","messagename","successfully deleted the user information");
}
}
