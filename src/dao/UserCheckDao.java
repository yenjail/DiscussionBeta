package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.SignupModel;
import model.Student;

public class UserCheckDao {
	public void saveStudent(SignupModel  sgn2) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
			Statement stmt = (Statement) con.createStatement();
			String sql = "SELECT `username`, `password` FROM `signuptbl`";
			stmt.executeQuery(sql);
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
            	String username=rs.getString("username");
            	String password=rs.getString("password");
            	
            }
           

			

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}
}
