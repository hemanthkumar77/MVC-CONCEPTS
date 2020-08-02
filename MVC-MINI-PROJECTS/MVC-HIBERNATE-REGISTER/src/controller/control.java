package controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service_Interface.ser_inter;
import model.student;
import model.validate;
@Controller
@RequestMapping("/")
public class control {
	@Autowired
	private ser_inter services;
	
public ser_inter getServices() {
		return services;
	}
	public void setServices(ser_inter services) {
		this.services = services;
	}
@RequestMapping(value="/",method=RequestMethod.GET)
public String index(Model mod)
{
	mod.addAttribute("user",new student());
	return "register";
}
@RequestMapping(value="/save",method=RequestMethod.POST)
public String save(@ModelAttribute("user") student stud,BindingResult result,Model mod)
{
	if(result.hasErrors())
	{
		return "register";
	}
	else
	{
		if(getServices().create_user(stud)==true)
		{
			mod.addAttribute("message","Data saved successfully");
		}
		else
		{
			mod.addAttribute("meesage","DB-issue please contact web adminstrator web -adminstrator" );
		}
		return"success";
	}
}
 
@RequestMapping(value="/login",method=RequestMethod.GET)
public String login(Model mod)
{
	mod.addAttribute("obj", new validate());
	return "login";
}

@RequestMapping(value="/profile",method=RequestMethod.POST)
public String login_success(@ModelAttribute("obj") validate stude,BindingResult result,Model mod)
{
	if(result.hasErrors())
	{
		return "login";
	}
	student value=getServices().validate(stude.getName(),stude.getId());
	if(value!=null)
	{
		mod.addAttribute("val",value );
		return "profile";
	}
	else
	{
		return "error";
	}
}
@RequestMapping(value="/list_users",method=RequestMethod.GET)
public String list(Model mod)
{
	List<student>users=getServices().getlist();
	mod.addAttribute("users",users);
	return "list";
}


@RequestMapping(value="/update_form",method=RequestMethod.GET)
public String update(@RequestParam("set_id") int id,Model mod)
{
	student stu=getServices().get_id(id);
	mod.addAttribute("stud", stu);
	return "edit";
}
@RequestMapping(value="/update_value",method=RequestMethod.POST)
public String new_val(@ModelAttribute("stud") student stu,BindingResult res,Model mod)
{
	if(res.hasErrors())
	{
		return "edit";
	}
	getServices().update(stu);
	return "redirect:/list_users";
}
@RequestMapping(value="/delete",method=RequestMethod.GET)
public String terminate(@RequestParam("del_id") int id)
{
   getServices().eliminate(id);
	return "redirect:/list_users";
}

     @ModelAttribute
	public void inner_list(Model mod)
	{
    	 List<String> course=new ArrayList<String>();
    	 List<String> gender=new ArrayList<String>();
    	 
    	 course.add("DBA");
    	 course.add("ANGULAR-8");
    	 course.add("NODE-JS");
    	 course.add("spring-core");
    	 course.add("spring-boot");
    	 course.add("spring-mvc");
    	 course.add("spring-cloud");
    	 course.add("javascript-basics,advance");
    	 
    	 gender.add("male");
    	 gender.add("female");
    	 
    	mod.addAttribute("genders",gender);
        mod.addAttribute("subjects", course);
	}
}
