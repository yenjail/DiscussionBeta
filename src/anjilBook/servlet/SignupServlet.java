package anjilBook.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SignupDao;
import model.SignupModel;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname=request.getParameter("fullnameSi");
		String email=request.getParameter("emailSi");
		String username=request.getParameter("usernameSi");
		String password=request.getParameter("passwordSi");
		String re_password=request.getParameter("re-passwordSi");
		
		SignupModel sgn1=new SignupModel(fullname,email,username,password);
		sgn1.setFullname(fullname);
		sgn1.setEmail(email);
		sgn1.setUsername(username);
		sgn1.setPassword(password);
		
		
		if(password.equals(re_password)){		
		SignupDao sgdao = new SignupDao();
		sgdao.signupStore(sgn1);
		
		request.setAttribute("user", sgn1);
		PrintWriter out = response.getWriter();
		out.println("<h2 style='color:red'> Sign Up.Successfull </h2>");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		}
		
		else{
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			rd.include(request, response);
			PrintWriter out = response.getWriter();
			out.println("<h2 style='color:red'> UserName unavailable retype password again. </h2>");
		}
		
	}

}
