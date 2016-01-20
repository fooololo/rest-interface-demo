package com.example;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceImpl implements RestService {

	@Override
	public String foo(MetasyntacticVariable arg) {
		return arg.name();
	}

}
