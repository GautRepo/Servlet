package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindCapitalServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//set response content type 
		res.setContentType("text/html");
		
		//get PrinWriter obj
		PrintWriter pw = res.getWriter();
		int countryCode = Integer.parseInt(req.getParameter("country"));
		
		//setting business logic 
		String[] capital=new String[] {"New Delhi","Washington, D.C.","Beijing","Tokyo","Bonn"};
		pw.println("<h1 style='color:red; text-align:center'>The Capital city name::"+capital[countryCode]+"</h1>");
		pw.println("<br><a href='input.html'>|Home|</a>");
		
		//closing stream
		pw.close();
	}
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}

}
