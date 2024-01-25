package com.dev.kit.functions.sqlgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SqlGeneratorController {
	@GetMapping
	public String page() {
		return "sqlgenerator/sqlgenerator";
	}

}
