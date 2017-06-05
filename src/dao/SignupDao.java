package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.SignupModel;

public class SignupDao {
	public void signupStore(SignupModel sgn){
		try {
//			Class.forName("com.mysql.jdbc.driver");
//			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
//			String sql1 = "INSERT INTO `signuptbl` (`fullname`, `email`, `username`, `password`) VALUES (?, ?, ?, ?)";
//			//INSERT INTO `signuptbl` (`fullname`, `email`, `username`, `password`) 
//			//VALUES ('Anjil Shrestha', 'yenjail16@gmail.com', 'yenjail', 'elhabla');
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
			String sql = "INSERT INTO `signuptbl` (`fullname`, `email`, `username`, `password`) VALUES (?, ?, ?, ?)";
			// INSERT INTO `studentweb`.`student` (`id`, `name`, `address`,
			// `gender`, `country`) VALUES ('121', 'Anjil', 'Shrestha', 'Male',
			// 'Nepal');
			
			
			
//			PreparedStatement psta1=con1.prepareStatement(sql1);
//			psta1.setString(1, sgn.getFullname());
//			psta1.setString(2, sgn.getEmail());
//			psta1.setString(3, sgn.getUsername());
//			psta1.setString(4, sgn.getPassword());
//			psta1.execute();
//			con1.close();
			
			PreparedStatement psta1 = con.prepareStatement(sql);
			
			psta1.setString(1, sgn.getFullname());
			psta1.setString(2, sgn.getEmail());
			psta1.setString(3, sgn.getUsername());
			psta1.setString(4, sgn.getPassword());
			
			
			psta1.execute();
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentweb", "root", "");
//			String sql = "INSERT INTO `studentweb`.`student` (`id`, `name`, `address`, `gender`, `country`) VALUES (?, ?, ?, ?, ?)";
//			// INSERT INTO `studentweb`.`student` (`id`, `name`, `address`,
//			// `gender`, `country`) VALUES ('121', 'Anjil', 'Shrestha', 'Male',
//			// 'Nepal');
//			PreparedStatement psta = con.prepareStatement(sql);
//
//			psta.setString(1, std.getId());
//			psta.setString(2, std.getName());
//			psta.setString(3, std.getAddress());
//			psta.setString(4, std.getGender());
//			psta.setString(5, std.getCountry());
//			
//			psta.execute();
//			con.close();
//
//		} catch (ClassNotFoundException | SQLException e) {
//
//			e.printStackTrace();
//		}
		
	}
}
