package org.techm.restapi.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //-> @Controller+ @RequestMapping
public class FirstRestController {
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	
	//@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello Friends!!!";
	}

}
