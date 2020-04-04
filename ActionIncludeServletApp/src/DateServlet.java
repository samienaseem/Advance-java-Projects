import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

final class DateServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
		
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		Date d=new Date();
		pw.println("the present Date is:");
		pw.println(d.toString());
		pw.print("<br>");
		
		
		

}
	}