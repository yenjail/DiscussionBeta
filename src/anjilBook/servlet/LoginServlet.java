package anjilBook.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserCheckDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");  //if username is anjil them the variable userName changes to anjil
		String password = request.getParameter("password");
		//show in console
		System.out.println(username+"  "+password);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
			Statement stmt = (Statement) con.createStatement();
			String sql = "SELECT `username`, `password` FROM `signuptbl`";
			stmt.executeQuery(sql);
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
            	String dbusername=rs.getString("username");
            	String dbpassword=rs.getString("password");
            	if(username.equals(dbusername) && password.equals(dbpassword)){
            		//success
            		
        			
        			//Save user in the session:
        			HttpSession session=request.getSession();
        			session.setMaxInactiveInterval(120);
        			session.setAttribute("activeUser", username);
        			session.setAttribute("ProjectName", "Anjil Book");
        			
        			//show home
        			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
        			rd.forward(request, response);
            	}else{
            		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        			rd.include(request, response);
        			
        			PrintWriter out = response.getWriter();
        			out.println("<h2 style='color:red'> Sorry! Wrong username or password. </h2>");
            	}
            }
           

			

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		
		
		
		
//		if(username.equals("admin") && password.equals("admin")){
//			//success
//		
//			
//			//Save user in the session:
//			HttpSession session=request.getSession();
//			session.setMaxInactiveInterval(120);
//			session.setAttribute("activeUser", username);
//			session.setAttribute("ProjectName", "Anjil Book");
//			
//			//show home
//			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
//			rd.forward(request, response);
//			
//			
//			
//			
//		}else{
//			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//			rd.include(request, response);
//			
//			PrintWriter out = response.getWriter();
//			out.println("<h2 style='color:red'> Sorry! Wrong username or password. </h2>");
//			
//		}
		
		
		
	}

}
