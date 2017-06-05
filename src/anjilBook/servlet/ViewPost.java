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

import dao.CommentsDao;
import model.CommentsModel;

/**
 * Servlet implementation class ViewPost
 */
@WebServlet("/ViewPost")
public class ViewPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		// jdbc driver name and database url
//		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//		final String DB_URL = "jdbc:mysql://localhost:3306/signupstore";
//		// database credemtials
//		final String USER = "root";
//		final String PASS = "";
//
//		// set response content type
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		String title = "Database Result";
//		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
//		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
//				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n");
//		// register JDBC driver
//		try {
//			Class.forName("com.mysql.jdbc,Driver");
//			// open a connection
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
//
//			// execute sql query
//			Statement stmt = conn.createStatement();
//			String sql;
//			sql = "SELECT `commento` FROM `comments`";
//			ResultSet rs = stmt.executeQuery(sql);
//			// extract data from result set
//			while (rs.next()) {
//				// retreive by column name
//				String com = rs.getString("commento");
//
//				// display values
//				out.println(com);
//			}
//			out.println("</body></html>");
//			// clean-up environment
//			rs.close();
//			stmt.close();
//			conn.close();
//		} catch (ClassNotFoundException | SQLException e) {
//
//			e.printStackTrace();
//		}
//		// finally{
//		// //finally block used to close resources
//		// try{
//		// if(stmt!=null)
//		// stmt.close();
//		// }catch(SQLException se2){
//		// }// nothing we can do
//		// try{
//		// if(conn!=null)
//		// conn.close();
//		// }catch(SQLException se){
//		// se.printStackTrace();
//		// }//end finally try
//		// } //end try
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pst = 0;
		String usn = request.getParameter("usnam");
		String cmt = request.getParameter("coments");

		CommentsModel cmntsM = new CommentsModel();
		cmntsM.setUsername(usn);
		cmntsM.setCommento(cmt);

		CommentsDao cdao = new CommentsDao();
		cdao.commentsStore(cmntsM);
		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.include(request, response);
		PrintWriter pt=response.getWriter();
		pt.print("<h2 style='color:red'> Posted </h2>");

	}

}
