package com.rajkhare.helloapp;

import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
                String name = request.getParameter("name");
                request.setAttribute("hello","Hello Sir/Madam:  "+name+", How are You!!!");
                request.getRequestDispatcher("response.jsp").forward(request,response);
     }
}
