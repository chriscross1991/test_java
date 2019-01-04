package Controller;

import Model.Accountant;
import Model.DatabaseAdministrator;
import Model.Webdesigner;
import View.Layout;
import DataBaseFactory.databasefactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;






public class ControlUnit {
	
	    Accountant Acc;
		DatabaseAdministrator DBA;
		Webdesigner WD;
		ControlUnit CU;
		Layout LO;
		databasefactory df;
		
		
		 private static java.sql.Connection con; 
		  private Statement stat=null;
		  private ResultSet Result_set=null;
		  
		  private int user_id;
		  private String user_name;
		  private String user_password;
		  
		
	ControlUnit(){
	  LO = new Layout(this); 
     //Selectdept();
	  Acc = new Accountant();
	  DBA = new DatabaseAdministrator();
	  WD = new Webdesigner();
	  df = new databasefactory();
	  
	  con=databasefactory.getDatabaseConnection();
	}//end function
	
	
	public void Selectdept(String dID){
		
	    if( dID.equals(Acc.getDeptID() )){
	    	
	    	LO.showdept(dID);    	
	    }
	    			
	    if( dID.equals(DBA.getDeptID() ) ) {
	    	LO.showdept(dID);
	    } 		
	    				
	    if(dID.equals(WD.getDeptID() ) ){
	    	LO.showdept(dID);
	    }   		 
	}//end function
	
	
	public void LoginUser(String id, String username ,String userpass ){
		
		//databasefactory.getDatabaseConnection();
		
		DBA.setID(Integer.valueOf(id));
		DBA.setUserName(username);
		DBA.setUserPassword(userpass);
		
		if(id.equals("User ID")){
			LO.showerrorlogin("User Name");
		  }
		
		  if(username.equals("")){
			LO.showerrorlogin("User Name");
		  }
		  
			  
		  if(userpass.equals("")){
			LO.showerrorlogin("Password");
		  }
		  
		  else 
			  
		if (username!=" " && userpass!=" " && id!=""){
		   LO.showinfo(DBA.getUserName());
		   LO.clearFeilds();	  
	    }	
		  
		  //read_records();
		  select_record();
		  	  
		 
	}//end function
	
	
	
	//*****Database functionalities******
	
	void read_records() {
		
		String query="SELECT * FROM customers";
		try {
			PreparedStatement pstat = con.prepareStatement(query);
	
		      Result_set=pstat.executeQuery(query);
		      while(Result_set.next()) {
		        	DBA.setFname(Result_set.getString("fname"));
		        	DBA.setLname(Result_set.getString("lname"));
		        	DBA.setAddress(Result_set.getString("address"));
		        	
		        	 LO.showuser_data_infor(DBA.getFname()+" \t " +DBA.getLname()+" \t "+DBA.getAddress()); 
		    	 // System.out.println(Result_set.getString("fname") +"\t" + Result_set.getString("lname") +"\t"+
		    	// Result_set.getString("address")); 
		      }
			Result_set.close();
			pstat.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}//end function
	
	
	void select_record() {
		
		String query="SELECT * FROM customers WHERE cid = "+DBA.getID();
		try {
			PreparedStatement pstat = con.prepareStatement(query);
		        Result_set=pstat.executeQuery(query);
		        while(Result_set.next()) {
		        	
		        	DBA.setFname(Result_set.getString("fname"));
		        	DBA.setLname(Result_set.getString("lname"));
		        	DBA.setAddress(Result_set.getString("address"));
		        	
		            LO.showuser_data_infor(DBA.getFname()+" \t " +DBA.getLname()+" \t "+DBA.getAddress()); 
		        }
			Result_set.close();
			pstat.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		
	}
	
	void create_records() {
		
		
		
	}
	
	void update_records() {
		
		
	}
	
	void delete_records() {
		
	}
	
	//***********************************
	
	
	public static void main(String[] arg){
		
		new ControlUnit();
	
	}

	

}
