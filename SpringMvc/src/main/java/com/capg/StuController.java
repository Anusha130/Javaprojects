package com.capg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuController {
	
	
	@ResponseBody
	@GetMapping("/hi")
 public String hello() {
	 return "hello student welcome";
 }
}
