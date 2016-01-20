package com.example;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/svc")
public interface RestService {

	@RequestMapping(path = "/{arg}", method = GET)
	String foo(@PathVariable MetasyntacticVariable arg);
}
