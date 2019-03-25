package com.jadid.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import javax.validation.Valid;
//import java.util.HashMap;
//import java.util.Map;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form-entry", "legends", new Legends());
    }
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String submit(@ModelAttribute("legends")Legends legends, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }
		        model.addAttribute("id", legends.getId());
		        model.addAttribute("name", legends.getName());
		        model.addAttribute("role", legends.getRole());
		        model.addAttribute("gender", legends.getGender());
		        return "form-view";
		    }
	
}
