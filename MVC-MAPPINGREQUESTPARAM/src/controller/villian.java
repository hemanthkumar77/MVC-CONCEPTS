package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class villian {
@RequestMapping(value="/",method=RequestMethod.GET)
public String return_page()
{
	return "register";
}
@RequestMapping(value="/store_data",method=RequestMethod.POST)
public ModelAndView register(@RequestParam Map<String,String> para)
{
	//@RequestParam("FN")String name,@RequestParam("age")int age,@RequestParam("dropdown") String villian_type
	user object=new user(para.get("FN"),Integer.parseInt(para.get("age")),para.get("dropdown"));
	ModelAndView mav=new ModelAndView("success");
	mav.addObject("user_val",object);
	return mav;
	
}
}
