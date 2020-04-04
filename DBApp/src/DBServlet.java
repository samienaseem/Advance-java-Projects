

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/dburl")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection c;
	Statement st;
	PrintWriter pw;
	HttpServletResponse res;
	HttpServletRequest req;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()throws ServletException{
    	
    	
    	try{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
    		System.out.println("Connected");
    		/*pw=res.getWriter();
    		pw.print("connected");*/
    		
    		
    		
    	}
    	catch(SQLException e){
    		/*pw.print(e.toString());*/
    		
    	}
    	catch(ClassNotFoundException  ex){
    		/*pw.print(ex.toString());*/
    	
    		
    	}
    	catch(Exception e){
    		pw.print(e.toString());
    	}
    	
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.req=request;
		this.res=response;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
