package anjilBook.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchData
 */
@WebServlet("/FetchRecords")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		//jdbc driver name and database url
//		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//		final String DB_URL="jdbc:mysql://localhost:3306/signupstore";
//		//database credemtials
//		final String USER="root";
//		final String PASS="";
//		
//		//set response content type
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		String title = "Database Result";
//		String docType= 
//				"<!doctype html public \"-//w3c//dtd html 4.0 " +
//				         "transitional//en\">\n";
//				         out.println(docType +
//				         "<html>\n" +
//				         "<head><title>" + title + "</title></head>\n" +
//				         "<body bgcolor=\"#f0f0f0\">\n" +
//				         "<h1 align=\"center\">" + title + "</h1>\n");
//		//register JDBC driver
//		try {
//			Class.forName("com.mysql.jdbc,Driver");
//			//open a connection 
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
//			
//			//execute sql query
//			Statement stmt=conn.createStatement();
//			String sql;
//			sql="SELECT `commento` FROM `comments`";
//			ResultSet rs = stmt.executeQuery(sql);
//			//extract data from result set
//			while(rs.next()){
//				//retreive by column name
//				String com=rs.getString("commento");
//				
//				//display values
//				out.println(com);
//			}
//			out.println("</body></html>");
//			//clean-up environment
//			rs.close();
//			stmt.close();
//			conn.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			
//			e.printStackTrace();
//			}
//			//finally{
////	         //finally block used to close resources
////	         try{
////	            if(stmt!=null)
////	               stmt.close();
////	         }catch(SQLException se2){
////	         }// nothing we can do
////	         try{
////	            if(conn!=null)
////	            conn.close();
////	         }catch(SQLException se){
////	            se.printStackTrace();
////	         }//end finally try
////	      } //end try
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
			Statement stmt = (Statement) con.createStatement();
			String sql = "SELECT * FROM `comments`";
			stmt.execute(sql);
			ResultSet rs = stmt.getResultSet();
			//int pstID = 0;
			ArrayList <Integer> postAr=new ArrayList<Integer>();
			ArrayList <String> usAr=new ArrayList<String>();
			ArrayList <String> comAr=new ArrayList<String>();
			//String usnm="";
			//String commentsP="";
				while(rs.next()){
					int pstID = rs.getInt("postID");
					String usnm = rs.getString("username");
					String commentsP = rs.getString("commento");
					postAr.add(pstID);
					usAr.add(usnm);
					comAr.add(commentsP);

				
				
				}
				request.setAttribute("pstID", postAr);
				request.setAttribute("usrnm", usAr);
				request.setAttribute("coment", comAr);
				
				 //Post ID: ${pstID} <br/><hr/>
				
				RequestDispatcher rd = request.getRequestDispatcher("viewPost.jsp");
				rd.forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

}
