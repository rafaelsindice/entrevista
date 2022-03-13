package br.com.serasa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/")
@RestController
public class IndexController {	
	
	public String hello() {
		return "Hello World!";
	}
}

