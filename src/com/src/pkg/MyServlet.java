package com.src.pkg;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] arr;
		PrintWriter out = response.getWriter();
		arr = request.getParameterValues("email");
		if(arr == null) {
			out.print("You have to fill in the email.");
		} else {
			if(arr[0].isEmpty()) {
				out.print("You have to fill in the email.");
			} else {
				if(EmailValidation.validate(arr[0])) {
					out.print("Email is valid: " + arr[0]);
//					EmailHistory.addNew(arr[0], true);
				} else {
					out.print("Email is invalid: " + arr[0]);
//					EmailHistory.addNew(arr[0], false);
				}
			}			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
