package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/employees",method=RequestMethod.GET)
public class employee {
@RequestMapping(value="/employee/{emp_id}/{emp_name}")
public ModelAndView employee(@PathVariable("emp_id") int id,@PathVariable("emp_name") String name,@RequestParam("salary")double salary)
{
	return new ModelAndView("details","messagename","employee_id :"+id+"\t"+"employee_name :"+name+"\t"+"salary: "+salary);
}
}
