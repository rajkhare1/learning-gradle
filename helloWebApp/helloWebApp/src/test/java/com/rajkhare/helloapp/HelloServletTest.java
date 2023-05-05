package com.rajkhare.helloapp;
import  org.junit.Before;
import  org.junit.Test;
import  org.mockito.Mock;
import org.mockito.MockitoAnnotations;
 
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

 
public class HelloServletTest {
 
    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;

 
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    

    @Test
    public void doPost() throws Exception {
     when(request.getParameter("name")).thenReturn("rajkhare");
     when(request.getRequestDispatcher("response.jsp")).thenReturn(requestDispatcher);
     new HelloServlet().doPost(request,response);
     verify(request).setAttribute("hello","Hello Sir/Madam: rajkhare, How are You!!!");
     verify(requestDispatcher).forward(request,response);

    }
 
}