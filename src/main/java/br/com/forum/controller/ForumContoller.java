package br.com.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ForumContoller {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "olá teste";
	}
}
