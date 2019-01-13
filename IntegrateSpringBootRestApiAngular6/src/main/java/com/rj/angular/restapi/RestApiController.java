package com.rj.angular.restapi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestApiController {

	@RequestMapping("/api/hi")
	public String hi()
	{
		return "Hello World >>> Message from <a href='https://grokonez.com' target='_blank'>grokonez.com</a>";
	}
}
