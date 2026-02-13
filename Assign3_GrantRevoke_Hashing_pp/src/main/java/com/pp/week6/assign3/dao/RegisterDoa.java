package com.pp.week6.assign3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pp.week6.assign3.Register;




/**

@Pratik Patel
@Tuesday, February 17, 2026
 
Description - These methods implement the Create and Read operations of CRUD.
 			  The registerInsert method uses a PreparedStatement to securely 
			  store data, while registerSelect verifies if a user_id already 
			  exists to prevent duplicate entries.


*/




public class RegisterDoa {
	

	// method for inserting values to db using preparedstatement. 	
		public int registerInsert(Register reg) throws ClassNotFoundException {

			// create SQL statement
			String INSERT_USERS_SQL = " INSERT INTO user_record" + " (user_id, user_password, email, mobile) VALUES "
					+ "(?, ? ,?, ?);";
			int result = 0;
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assign3_db_pp", "nets1038_w2026_pp",
					"class123")) {
				// prepared statements..
				// week6 is schema/db name - change as per your db, "root" remains same , your
				// pass as per ur db
				PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL);
				ps.setString(1, reg.getUser_id());
				ps.setString(2, reg.getPassword());
				ps.setString(3, reg.getEmail());
				ps.setString(4, reg.getMobile());

				System.out.println(ps);
				result = ps.executeUpdate();
			} catch (SQLException e) {
				printSQLException(e);
				
			}
			return result;
		}
		
		
		// A method for a preparedstatement to select the row that has the user_id inside.
		// if it does have the user_id return true. 
		// if it does not have the user_id then return false
		public boolean  registerSelect(Register reg) throws ClassNotFoundException {
			
			// find the row that contains the user_id 
			String SELECT_USERS_SQL = "SELECT * FROM user_record WHERE user_id = ?;";
			boolean exists = false;
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assign3_db_pp", "nets1038_w2026_pp",
					"class123")) {
				// prepared statement and gaining access to the db.
				PreparedStatement ps = connection.prepareStatement(SELECT_USERS_SQL);
				ps.setString(1, reg.getUser_id());
				
				ResultSet rs = ps.executeQuery();
				
				
				// checks if the user_id exist inside the db
				if(rs.next()) {
					exists = true;
				}
				
				
			
			} catch (SQLException e) {
				printSQLException(e);
				
			}
			return exists;
			
			
			
		}
		
		
		

		private void printSQLException(SQLException ex) {
			for (Throwable e : ex) {
				if (e instanceof SQLException) {

					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();

					}
				}

			}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}

























