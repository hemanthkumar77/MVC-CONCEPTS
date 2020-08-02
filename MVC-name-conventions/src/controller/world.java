package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import services.support;

@Controller
@RequestMapping(value="/")
public class world {
	@Autowired
	private support sup;
	@RequestMapping(method=RequestMethod.GET)
public ModelAndView method()
{
	return new ModelAndView("index","messagename",sup.method1());
	
}
	@RequestMapping(value="request",method=RequestMethod.GET)
public ModelAndView value()
{
	return new ModelAndView("index","messagename",sup.method2());
}
}

