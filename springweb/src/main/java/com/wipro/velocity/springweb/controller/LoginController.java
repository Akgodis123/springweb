package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/Login")
    public String showLoginForm()
    {
        return "Login";  //returns view
    }
}
