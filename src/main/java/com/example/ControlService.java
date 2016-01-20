package com.example;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class ControlService {

	@RequestMapping(path = "/{arg}", method = GET)
	public String foo(@PathVariable MetasyntacticVariable arg) {
		return arg.name();
	}
}
