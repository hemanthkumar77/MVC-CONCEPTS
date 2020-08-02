package contoller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.employee;


@Controller
@RequestMapping("/")
public class control {
@GetMapping("/")
public String index(Model mod)
{
	mod.addAttribute("stud",new employee());
	return "register";
}

@RequestMapping(value="/save",method=RequestMethod.POST)
public String persitentdata(@Valid @ModelAttribute("stud") employee stud, BindingResult result)
{
	if(result.hasErrors())
	{
	 return "register";
	}
	return "display";
}

}
