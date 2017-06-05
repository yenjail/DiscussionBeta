package anjilBook.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String country=request.getParameter("country");
		
		Student stud=new Student(id,name,address,gender,country);
		stud.setID(id);
		stud.setName(name);
		stud.setAddress(address);
		stud.setGender(gender);
		stud.setCountry(country);
		
		StudentDao stdDao = new StudentDao();
		stdDao.saveStudent(stud);
		//display stud object information in the jsp page
		request.setAttribute("student", stud);
		request.setAttribute("studentGrade", "A+");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("studentInfo.jsp");
		rd.forward(request, response);
		
	}

}
