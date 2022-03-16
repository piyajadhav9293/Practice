package spring.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.love.api.RegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/reg")
	public String registratiopage(@ModelAttribute("userReg") RegistrationDTO registrationDTO) {
		return "user-reg-page";
	}

	@RequestMapping("/regSuccess")
	public String regSuccess(@ModelAttribute("userReg") RegistrationDTO registrationDTO) {

		return "reg-Success";
	}
}
