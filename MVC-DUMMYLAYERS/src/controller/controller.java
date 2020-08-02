package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.student;
import service.service_layer;

@Controller
@RequestMapping("/")
public class controller {
@Autowired
private service_layer ser;
@RequestMapping(value="/",method=RequestMethod.GET)
private String method1()
{
	return "register";
}
@RequestMapping(value="/save",method=RequestMethod.POST)
private String save_data(@RequestParam Map<String,String>map)
{
  student obj=new student(Integer.parseInt(map.get("id")),map.get("name"),Integer.parseInt(map.get("dept_id")),map.get("dept_name"),Double.parseDouble(map.get("sal")));
  ser.create_user(obj);
	return "redirect:/list_employee";
}

@RequestMapping(value="/list_employee",method=RequestMethod.GET)
private ModelAndView listuser(ModelAndView mav)
{
	mav.setViewName("getuser");
	List<student> stu=ser.getdetails();
	mav.addObject("users",stu);
	return mav;
	
}


}
