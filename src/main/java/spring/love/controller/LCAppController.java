package spring.love.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.love.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showhomepage(@ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO) {
		return "home-page";
	}
	@RequestMapping("/process-homepage")
	public String processhomepage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO, BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> error = result.getAllErrors();
			for (ObjectError objectError : error) {
				System.out.println(objectError);
			}
			return "home-page";
		}
		return "result";
	}
}
