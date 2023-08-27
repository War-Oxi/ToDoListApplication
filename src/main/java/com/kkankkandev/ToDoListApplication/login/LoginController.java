package com.kkankkandev.ToDoListApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//login => com.kkankkandev.TodoListApplication.login.LoginController => login.jsp


	//http://localhost:8080/login?name=Ranga
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Request param is " + name);
		return "login";
	}
}