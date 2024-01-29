package com.dev.kit.functions.sqlgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SqlGeneratorController {
	@GetMapping(value = "/sqlgenerator/kr")
	public String pageByKr() {
		return "sqlgenerator/sqlgenerator_kr";
	}

	@GetMapping(value = "/sqlgenerator/jp")
	public String pageByJp() {
		return "sqlgenerator/sqlgenerator_jp";
	}

}
