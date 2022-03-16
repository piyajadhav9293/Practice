package spring.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	//@ResponseBody
	@RequestMapping("/test")
	public String testmethod() {
		// return "hey Its working";

		return "Hello";
	}
}
