package net.viralpatel.spring;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {

	@RequestMapping(value = "/hello.htm")
	public String hello() throws IOException {
		
		// render hello.jsp page
		return "hello";
	}


	@RequestMapping(value = "/test.htm")
	public String test() throws IOException {
		
		if(true) {
			throw new IOException("this is io exception");
		}
		
		// render hello.jsp page
		return "hello";
	}
}
