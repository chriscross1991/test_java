package DataBaseFactory;
import java.sql.DriverManager;  
import java.sql.SQLException;  


public class databasefactory {
	
	private static java.sql.Connection con = null;
	
	
	public static java.sql.Connection getDatabaseConnection() {
		
		if(con==null) {
			
			try {
				
				//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"sampledb","root", "");
				con=DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/"+"sql3272577","sql3272577","Bj8pgNS99Y");
				System.out.println("\nDatabase Connection succesful!");
			}catch( Exception e) {
				e.printStackTrace();
				System.out.println("\nFailed to connect to data base!!!");
			}
		}
	
		return con;
	}

}
