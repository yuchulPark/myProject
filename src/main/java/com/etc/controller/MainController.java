package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/main.do")
	public ModelAndView main() {
		ModelAndView m = new ModelAndView();
		return m;
	}
}
