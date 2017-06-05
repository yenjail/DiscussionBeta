package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Student;

public class StudentDao {
	public void saveStudent(Student std) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentweb", "root", "");
			String sql = "INSERT INTO `studentweb`.`student` (`id`, `name`, `address`, `gender`, `country`) VALUES (?, ?, ?, ?, ?)";
			// INSERT INTO `studentweb`.`student` (`id`, `name`, `address`,
			// `gender`, `country`) VALUES ('121', 'Anjil', 'Shrestha', 'Male',
			// 'Nepal');
			PreparedStatement psta = con.prepareStatement(sql);

			psta.setString(1, std.getId());
			psta.setString(2, std.getName());
			psta.setString(3, std.getAddress());
			psta.setString(4, std.getGender());
			psta.setString(5, std.getCountry());
			
			psta.execute();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}
}
