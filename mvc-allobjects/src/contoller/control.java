package contoller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class control {
	/*	
@RequestMapping(value="/")  // first method
public String  method1(Model mav)
{
  	mav.addAttribute("welcomemessage","hello world");
  	mav.addAttribute("welcomenote","www.hammerhead.com");
  	return "welcome";
}*/
	/*@RequestMapping(value="/")  // second method
	public String  method1(Map<String,String> map)
	{
	  	map.put("welcomemessage","hello world");
	  	map.put("welcomenote","www.hammerhead.com");
	  	return "welcome";
	}*/
@RequestMapping(value="/")//third method
public String method2()
{
	return "welcome";
}
@ModelAttribute
public void method(Model mav)
{
	mav.addAttribute("welcomemessage","hello world");
	mav.addAttribute("welcomenote", "www.hammerhead");
}
}
