package edu.wccnet.christopherlively.springMVC.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@Autowired
	@Qualifier("randNumRequest")
	RandomNumb random1;
	@Autowired
	@Qualifier("randNumSession")
	RandomNumb random2;
	
	@RequestMapping("/")
	public void getRandomNumb(HttpServletResponse response) throws IOException {
		response.getWriter().println("-------request scope--------");		
		response.getWriter().println(random1.getRand());
		random1.generateRandom();
		response.getWriter().println(random1.getRand());
		
		response.getWriter().println("-------session scope--------");		
		response.getWriter().println(random2.getRand());
		random2.generateRandom();
		response.getWriter().println(random2.getRand());
		

		
	}

}
