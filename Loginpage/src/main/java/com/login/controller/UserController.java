package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.login.entity.User;
import com.login.service.UserService;

@RestController
@RequestMapping("add")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/register")
	public ModelAndView showRegistrationForm() {
		return new ModelAndView("register");
	}

	@PostMapping("/registeruser")
	public ModelAndView registerUser(@RequestParam("id") String id, @RequestParam("username") String username,
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("password") String password, @RequestParam("confirmpassword") String confirmpassword) {
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);

		userService.saveUser(user);

		return new ModelAndView("redirect:/success");
	}

	@GetMapping("/success")
	public ModelAndView showSuccessPage() {
		return new ModelAndView("success");
	}
}
