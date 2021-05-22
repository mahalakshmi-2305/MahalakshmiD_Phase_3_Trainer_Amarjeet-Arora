package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.UserService;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserService service;

	@PostMapping(value = "/userlogin")
	public String userLogin(String name, String pass) {
		if (service.loginValid(name, pass)) {

			return "<html>" + "<head><style>#h1{color:green} body{background-color:skyblue}</style></head>" + "<body>"
					+ "<h1 id=h1>" + "Successfully Login" + "</h1>" + "<a href=index>" + "Back" + "</a>" + "</body>"
					+ "</html>";

		}

		return "<html>" + "<head><style>#h1{color:red} body{background-color:skyblue}</style></head>" + "<body>"
				+ "<h1 id=h1>" + "Username or Password incorrect!" + "</h1>" + "<a href=userlogin>" + "Back" + "</a>"
				+ "</body>" + "</html>";

	}

	@PostMapping("/register")

	public String registerUser(@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "email", defaultValue = "") String email,
			@RequestParam(name = "password", defaultValue = "") String password,
			@RequestParam(name = "adress", defaultValue = "") String adress,
			@RequestParam(name = "pincode", defaultValue = "") String pincode,
			@RequestParam(name = "state", defaultValue = "") String state,
			@RequestParam(name = "country", defaultValue = "") String country) {

		service.addUser(name, email, password, adress, pincode, state, country);

		return "<html>" + "<head><style>#h1{color:green} body{background-color:skyblue}</style></head>" + "<body>"
				+ "<h1 id=h1>" + "Successfully Registered" + "</h1>" + "<a href=index>" + "Back" + "</a>" + "</body>"
				+ "</html>";
	}

}
