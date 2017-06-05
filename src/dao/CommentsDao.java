package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.CommentsModel;

public class CommentsDao {
	public void commentsStore(CommentsModel cm){
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupstore", "root", "");
			String sql3="INSERT INTO `comments` (`username`,`commento`) VALUES (?, ?)";
			PreparedStatement psta3=con3.prepareStatement(sql3);
			psta3.setString(1, cm.getUsername());
			psta3.setString(2, cm.getComments());
			psta3.execute();
			con3.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
