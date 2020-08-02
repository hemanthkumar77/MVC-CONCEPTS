package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class domain {
@RequestMapping(value="/job_search/{domainname:.+}")
public ModelAndView method(@PathVariable("domainname") String name)
{
  return new ModelAndView("linked","messagename","domain_name: "+name);
}
}
