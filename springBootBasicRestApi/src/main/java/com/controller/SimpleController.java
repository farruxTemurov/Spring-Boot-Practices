package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello() {
		return "Welcome to rest api with hello path";
	}

	@RequestMapping(value = "hi", method = RequestMethod.GET)
	public @ResponseBody String sayHi() {
		return "Welcome to rest api with hi path";
	}
}
