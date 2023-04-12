package com.example.greensblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
	
	@GetMapping("/greensblog")
	public String blogPage() {
		return "greensblog";
	}
	
	
} // end of class
