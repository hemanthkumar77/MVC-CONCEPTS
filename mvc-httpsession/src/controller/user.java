package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class user {
@RequestMapping(value="/recheck",method=RequestMethod.GET)
public ModelAndView method2(HttpServletRequest req,HttpServletResponse res)
{
	HttpSession obj=req.getSession();
	String value=(String)obj.getAttribute("pas");
	return new ModelAndView("check","values",value);
}
	
}
