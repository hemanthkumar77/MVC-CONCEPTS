package CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.employee;

@Controller
@RequestMapping("/")
public class control {
	@InitBinder
	public void method(WebDataBinder bin)
	{
		//bin.setDisallowedFields(new String[] {"phone_num"});
	   StringTrimmerEditor object=new StringTrimmerEditor(true);
	   bin.registerCustomEditor(String.class,object);	
	}

	@GetMapping(value="/")
	public String method(Model mod)
	{
		mod.addAttribute("stu", new employee());
		return "register";
	}
	
	@PostMapping(value="/save")
	public String method(@ModelAttribute ("stud") employee emp,BindingResult result,Model mod)
	{
		if(emp.getName().isEmpty())
		{
			throw new RuntimeException();
		}
        if(result.hasErrors())
        {
        	return "register";
        }
        else
        {
        	mod.addAttribute("empl",emp);
        	return "success";
        }
	}
	@ModelAttribute
	public void set_values(Model mod)
	{
		List<String> rad=new ArrayList();
		rad.add("SQL-DBA");
		rad.add("NoSQl-mongodb");
		rad.add("hibernate");
		rad.add("spring-mvc");
		rad.add("spring-boot");
		rad.add("spring-cloud");
		
		List<String>gen=new ArrayList();
		gen.add("male");
		gen.add("female");
		mod.addAttribute("courseslist", rad);
		mod.addAttribute("genderlist", gen);
	}
	/*@ExceptionHandler(value=RuntimeException.class)   //This is said to be controller classs exceptions.
	public String exceptions()
	{
		return "error";
	}*/
}
