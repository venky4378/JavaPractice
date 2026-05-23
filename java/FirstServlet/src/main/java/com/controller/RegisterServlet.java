package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.StudentDAO;
import com.model.Student;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	public RegisterServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hello");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		System.out.println(firstName + " : " + lastName);
		Student s = new Student();
		s.setFirstname(firstName);
		s.setLastname(lastName);
		System.out.println(s);
		StudentDAO sd = new StudentDAO();
		sd.insertStudent(s);
	}

}
