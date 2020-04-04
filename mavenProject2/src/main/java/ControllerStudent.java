

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prolog.mavenProject2.BeanClass;

/**
 * Servlet implementation class ControllerStudent
 */
public class ControllerStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("Name");
		int id=Integer.parseInt(request.getParameter("id"));
		String email=request.getParameter("email");
		String course =request.getParameter("course");
		
		BeanClass b=new BeanClass();
		b.setId(id);
		b.setName(name);
		b.setEmail(email);
		b.setCourse(course);
		request.setAttribute("bean", b);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("DBModel");
		rd.include(request,response);
		
		PrintWriter pw=response.getWriter();
		pw.write(name);
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
