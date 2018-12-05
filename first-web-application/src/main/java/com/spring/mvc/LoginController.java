package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	//when we mentino ResponseBody then the dispatcher servlet will add the returned value
	//to the response body
	//else it will look for a view resolver with same name
	@RequestMapping(value="/login")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}
	
	
	//in this case the view resolver will resolve the content to welcome.jsp
	//based on the prefix and suffix added to welcome.The prefix and suffix are defined 
	//in the todo-servlet.xml
	//view resolver will resolve /user to /WEB-INF/views/welcome.jsp
	@RequestMapping(value="/user")
	public String welcomeUser() {
		return "welcome";
	}
}
