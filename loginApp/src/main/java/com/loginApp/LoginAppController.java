package com.loginApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAppController {
	@Value("${driverClassName}")
	String driverClassName;
	@Value("${url}")
	String url;
	@Value("${username}")
	String username;
	@Value("${password}")
	String password;
	
	@RequestMapping(value="/db",method=RequestMethod.GET)
	public String getLoginAppDetails() {
		Map<String,String> detailsMap = new HashMap<>();
		detailsMap.put("driverClassName", driverClassName);
		detailsMap.put("url", url);
		detailsMap.put("username", username);
		detailsMap.put("password", password);
		
		return detailsMap.toString();
	}
}
