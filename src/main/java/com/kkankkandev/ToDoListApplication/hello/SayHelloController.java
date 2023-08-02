package com.kkankkandev.ToDoListApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//"say-hello" => "Hello! What are you learning today?"

	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody //메시지 그대로 브라우저에 리턴
	public String sayHello(){
		return "Hello! What are you learning today?";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody //메시지 그대로 브라우저에 리턴
	public String sayHelloHtml(){
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body Changed");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

	//"say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
