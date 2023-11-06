package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mysql.jdbc.Driver;
public class DataBaseUtility implements IAutoConstants {
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
	/**
	 * This method is used to establish connection from dataBase
	 */
	public void establishingConnection() {
		 try {
			dbdriver = new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			connection = DriverManager.getConnection(DATABASE_URL,DATABASE_UN, DATABASE_PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/*
	 * This method is used to read the Data from Database.
	 * @return
	 */
	public ArrayList readingDataFromDataBase(String query,String columnName) {
		ArrayList list=new ArrayList();
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			while(result.next()) {
				 try {
					list.add(result.getString(columnName));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;		 
	}
	/**
	 * This method is used to close the connection of Database
	 */
	public void closingConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}		
}
