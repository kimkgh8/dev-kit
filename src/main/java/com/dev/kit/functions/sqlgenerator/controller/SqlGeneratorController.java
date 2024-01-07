package com.dev.kit.functions.sqlgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SqlGeneratorController {
	@GetMapping
	public String page() {
		return "sqlgenerator/sqlgenerator";
	}

}
