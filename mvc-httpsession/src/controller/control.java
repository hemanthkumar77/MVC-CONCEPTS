package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class control {
@RequestMapping(value="/")
public String return_page()
{
	return "index";
}

@RequestMapping(value="/success",method=RequestMethod.POST)
public ModelAndView method(HttpServletRequest req,HttpServletResponse res)
{
	String name=req.getParameter("un");
	String pass=req.getParameter("up");
	ModelAndView object=new ModelAndView("message");
	object.addObject("username",name);
	HttpSession obj=req.getSession();
	obj.setAttribute("pas",pass);
	return object;
}
}
