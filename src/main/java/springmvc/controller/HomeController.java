package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home url triggered");
		
		model.addAttribute("name", "Manish Jha");
		model.addAttribute("id", 101);
		
		List<String> li = new ArrayList<String>();
		li.add("English");
		li.add("Hindi");
		
		model.addAttribute("subjects", li); 
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about url triggered");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("rollNo", 1234);
		
		//telling page name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
