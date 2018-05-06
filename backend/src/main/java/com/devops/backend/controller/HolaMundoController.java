package com.devops.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HolaMundoController {

	@GetMapping("/holamundo")
	public String holaMundo() {
		return "holamundo";
	}
}