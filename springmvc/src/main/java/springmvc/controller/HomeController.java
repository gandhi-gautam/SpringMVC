package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Gautam Gandhi");
		List<String> friends = new ArrayList<String>();
		friends.add("Gautam");
		friends.add("Poonam");
		friends.add("Aditya");
		friends.add("Samir");
		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help Controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Gautam Gandhi");

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(35);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
