package application;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBManager {
	
	public List<String> loadStudents(){
		List<String> studentNames=new ArrayList<String>();
		Connection myConn=this.Connector();
		

		try {
			
			Statement myStmt=myConn.createStatement();
			
			String sql="Select name from studenttable";
			ResultSet myRs=myStmt.executeQuery(sql);
			
			while(myRs.next())
			{
				String name=myRs.getString("name");
				studentNames.add(name);
			}
			this.close(myConn,myStmt,myRs);
			return studentNames;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public Connection Connector(){ 
		try { 
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false", "root","Newtonienne973");
			
			return connection; 
			}
	
			catch (Exception e) 
			{ 
				e.printStackTrace(); 
				return null; 
			}
		}

	
	
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try{
		if(myStmt!=null) myStmt.close(); 
		if(myRs!=null) myRs.close(); 
		if(myConn!=null) myConn.close();
		} 
		catch(Exception e){ 
			System.out.println(e.getMessage()); 
			}
		} 
	
	
	

}
