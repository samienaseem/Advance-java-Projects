

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WordServlet
 */
@WebServlet("/WordServlet")
public class WordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 res.setContentType("application/msword");
		 res.setContentLength(10000);
		 PrintWriter pw=res.getWriter();
		 java.util.Date d=new java.util.Date();
		 pw.println("Date and time is :"+d.toString());
		pw.println("<br> Request Object (req) Class name is :"+req.getClass());
		pw.println("<br> Response Object (res) Class name is :"+res.getClass());
		pw.println("<br> <b>Hadh-Code of Request Object (req) is:<b>"+req.hashCode());
		pw.println("<br> <b>Hadh-Code of Response Object (res) is:<b>"+res.hashCode());
		//Printing the Thread name of each request
		pw.println("<br> <b>Thread name of current Request is:<b>"+Thread.currentThread().getName());



		//Printing the Hash Code of the Request and Response Object
		pw.println("<br> <b>Hadh-Code of Servlet Object (req) is:<b>"+this.hashCode());
		//Close Stream Object
		pw.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
