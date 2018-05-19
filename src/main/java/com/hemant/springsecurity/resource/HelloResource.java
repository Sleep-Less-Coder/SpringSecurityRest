package com.hemant.springsecurity.resource;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@RequestMapping
	@ResponseBody
	public String sayHello(@AuthenticationPrincipal final UserDetails userDetails) {
		
		String username = userDetails.getUsername();
		System.out.println(username);
		
		return "Hello World";
	}
}
