import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class subServelet extends HttpServlet
{
   public void service(HttpServletRequest req, HttpServletResponse res) {
	   String a=req.getParameter("t1");
	   String b=req.getParameter("t2");
	   
	   double x=Double.parseDouble(a);
	   double y=Double.parseDouble(b);
	   
	   double c=x-y;
	   System.out.println(c);
	   
	   try {
		PrintWriter pw=res.getWriter();
		pw.println("<body><h1> here is the substraction of two numbers "+c+"</h1><body>");
		pw.println("<a href=\"index.html\">Go Back</a>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
}