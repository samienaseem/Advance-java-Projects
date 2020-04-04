

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VotingCheck
 */
@WebServlet("/Voting")
public class VotingCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VotingCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int a=Integer.parseInt(request.getParameter("age").trim());
		String name=request.getParameter("Name");
		
		if (a<18) {

			pw.print("<font color='RED' size='4'>"+name+"<br>Welcome to prolog <br>You are not Eligible to vote</font><br>");

			}
			else {

			pw.print("<font color='RED' size='4'>"+name+"<br>Welcome to prolog <br>You are Eligible to vote</font><br>");

			}
			
			pw.print("<br><a href='index.html'>Back To Home</a>");
	}

}
