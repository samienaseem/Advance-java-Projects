

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import booksDetail.*;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBModel")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		
		Connection connection;
		Statement st=null;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			pw.println("okie");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			pw.println("okie2");
			request.setAttribute("Connection",connection );
			
			//pw.print(a);
			getValueFromDB(connection,st,request,response);
		}
		catch(Exception e){
			e.getCause();
			e.printStackTrace();
			pw.print(e.toString());
		}
		
	}

	private void getValueFromDB(Connection c,Statement s,HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw1=res.getWriter();
		try {
			String a=(String) req.getAttribute("query");
			s=c.createStatement();
			ResultSet r=s.executeQuery("select * from books where bookN="+"'"+a+"'");
			ArrayList ai=new ArrayList();
			r.next();
			
			BooksDetails bok=new BooksDetails();
			bok.setName(r.getString(3));
			bok.setAuthorName(r.getString(1));
			bok.setPrice(r.getInt(2));
			ai.add(bok);
			req.setAttribute("Arraylist", ai);
			req.getRequestDispatcher("viewModel.jsp").forward(req, res);
			/*BooksDetails ab=(BooksDetails) ai.get(0);
			pw1.print(ab.getName());*/
			//pw1.print(r);
			
			/*pw1.print(r.getString(1));
			pw1.print(r.getString(3));
			pw1.print(r.getInt(2));*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pw1.println(e.toString());
		} 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
