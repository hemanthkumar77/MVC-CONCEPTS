package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import MODEL.employee;
import MODEL.login;
import SERVICE_INTERFACE.SER_INTER;

@Controller
@RequestMapping("/")
public class control {
    @Autowired
	private SER_INTER ser;

	public SER_INTER getSer() {
		return ser;
	}

	public void setSer(SER_INTER ser) {
		this.ser = ser;
	}

	@GetMapping("/")
	public String index(Model mod)
	{
		mod.addAttribute("emp",new employee());
		return "register";
	}
	
	@PostMapping("/save")
	public ModelAndView valid(@Valid @ModelAttribute("emp") employee empl,BindingResult res,ModelAndView mod)
	{
		System.out.print(empl.getDept_id()+"  name: "+empl.getName());
		if(res.hasErrors())
		{
			mod.setViewName("register");
			return mod;
		}
		else
		{
			boolean val=getSer().insert_details(empl);
			if(val==true)
			{
				List<employee>object=getSer().get_list();
				mod.addObject("object", object);
			 mod.setViewName("list");
			 return mod;
		    }
			else
			{
				mod.setViewName("error");
				return mod;
			}
		}
	}
	@GetMapping("/list_users")
	public String all(Model mod)
	{
		List<employee>object=getSer().get_list();
		mod.addAttribute("object",object);
	    return "list";
	}
	
	@GetMapping("/login")
	public String login_page(Model mod)
	{
		mod.addAttribute("val",new login());
		return "login";
	}
	
	@PostMapping("/validate")
	public String check( @Valid @ModelAttribute("val") login log ,BindingResult res)
	{
	    if(res.hasErrors())
	    {
	    	return "login";
	    }
	    else
	    {
	    	employee emp=getSer().retrive(log.getId(),log.getName());
	    	if(emp!=null)
	    	{
	    		return "success";
	    	}
	    	else
	    	{
	    		return "invalid";
	    	}
	    }
	}

	  @GetMapping("/delete")
	 public String terminate(@RequestParam Map <String,String> obj )
	 {
	    if(getSer().delete_val(Integer.parseInt(obj.get("del_id")))==true);
	    {
	    	return "redirect:/list_users";
	    }
	 }
	  
	@GetMapping("/updateform")
	public String update(@RequestParam Map<String,String> obj,Model mod)
	{
		 employee emp=getSer().user_id(Integer.parseInt(obj.get("set_id")));
		  mod.addAttribute("emp",emp);
		  return "edit";
	}
	
	@PostMapping("/update_val")
	public String update(@Valid @ModelAttribute("emp") employee emp,Model mod,BindingResult res)
	{
		if(res.hasErrors())
		{
			return "edit";
		}
		else
		{
		if(getSer().changeval(emp)==true);
		{
		return "redirect:/list_users";
	    }
	}
	}
	@ModelAttribute
	public void inner_list(Model mod)
	{
		List<String>dept=new ArrayList();
		List<String>dept_id=new ArrayList();
		dept.add("java-microservices");
		dept.add("java-spring boot");
		dept.add(".net-microservices");
		dept.add("cloud-services");
		dept.add("testing");
		dept.add("HR");
		dept.add("operations");
		dept.add("support-services");
		dept.add("finance");
		dept.add("legal");
		dept_id.add("100");
		dept_id.add("200");
		dept_id.add("300");
		dept_id.add("400");
		dept_id.add("500");
		dept_id.add("600");
		dept_id.add("700");
		dept_id.add("800");
		mod.addAttribute("dep_name", dept);
		mod.addAttribute("dep_id",dept_id );
	}
}
