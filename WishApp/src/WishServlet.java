

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WishServlet
 */
@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishServlet() {
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Calendar c=Calendar.getInstance();
		int h=c.get(Calendar.HOUR_OF_DAY);
		if(h<12)
		{

		pw.println("Good Morning and Welcome to prolog");

		}
		else if(h<16)
		{

		pw.println("Good After Noon and Welcome to prolog");

		}
		else if(h<20)
		{

		pw.println("Good Evening and Welcome to prolog");

		}
		else
		{

		pw.println("Good Night and Welcome to prolog");

		}
		pw.close();
	}

}
