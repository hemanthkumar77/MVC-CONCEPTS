package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class second {

@RequestMapping(value="/customer-update")
public String method2()
{
	return "update";
}
}
