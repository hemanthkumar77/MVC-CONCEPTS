package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/employees")
public class employee {
@RequestMapping(value="/{emp_id}/{emp_name}")
public ModelAndView method(@PathVariable Map<String,String>var,@RequestParam Map<String,String> Par)
{          
	int id=Integer.parseInt(var.get("emp_id"));
	String name=var.get("emp_name");
	double sal=Double.parseDouble(Par.get("salary"));
	double tax=Double.parseDouble(Par.get("taxes"));
	return new ModelAndView("details","messagename","emp_name: "+name+"\t"+"employee_id: "+id+"\t"+"salary: "+sal+"\t"+"taxes: "+tax );
}
}
