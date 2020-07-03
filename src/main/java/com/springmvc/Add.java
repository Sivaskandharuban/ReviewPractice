package com.springmvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan(basePackages = {"com.springmvc"})
public class Add {
	
	int a,b,c;
	
	@RequestMapping("/add")
	public void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
			PrintWriter out = response.getWriter();
			a = Integer.parseInt(request.getParameter("first"));
			System.out.println(a);
			b = Integer.parseInt(request.getParameter("second"));
			System.out.println(b);
			c = a+b;
			System.out.println("Addition");
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(c);
			out.print("Addition " + result);
	}
	
	@RequestMapping("/sub")
	public void sub(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			a = Integer.parseInt(request.getParameter("first"));
			System.out.println(a);
			b = Integer.parseInt(request.getParameter("second"));
			System.out.println(b);
			c = a-b;
			System.out.println("Subtraction");
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(c);
			out.print("Subraction " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/mul")
	public void mul(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			a = Integer.parseInt(request.getParameter("first"));
			System.out.println(a);
			b = Integer.parseInt(request.getParameter("second"));
			System.out.println(b);
			c = a*b;
			System.out.println("Multiplication");
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(c);
			out.print("Multiplication " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/div")
	public void div(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			a = Integer.parseInt(request.getParameter("first"));
			System.out.println(a);
			b = Integer.parseInt(request.getParameter("second"));
			System.out.println(b);
			c = a/b;
			System.out.println("Division");
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(c);
			out.print("Division " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
