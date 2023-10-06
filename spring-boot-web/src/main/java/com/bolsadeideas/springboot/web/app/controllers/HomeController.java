package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		//return "redirect:https://www.google.es";
		//fordward:/app/index ->no cambia la ruta (es la mejor forma)
		return "fordward:/app/index";
	}

}
