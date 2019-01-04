package Model;
public class DatabaseAdministrator {
	
	private int ID;
	private String UserName;
	private String UserPassword;
	private String Fname;
	private String Lname;
	private String Address;
   


	


	private String BatchCode;
    private String DeptID="1002";
    
    
   public DatabaseAdministrator(){  
	 setID(0);  
	 setFname("");
	 setLname("");
	 setAddress("");
   	 setUserName("");
   	 setUserPassword("");
   	 setBatchCode("");	 
   }
    
     public DatabaseAdministrator(int id, String fname,String lname,String address,String UN, String UP, String BC){
    	 setID(id);
    	 setFname(fname);
    	 setLname(lname);
    	 setAddress(address);
    	 setUserName(UN);
    	 setUserPassword(UP);
    	 setBatchCode(BC);	 
    }
    
    
     public int getID() {
  		return ID;
  	}
     public void setID(int id) {
 		ID = id;
 	}
     
     public String getFname() {
 		return Fname;
 	}

 	public void setFname(String fname) {
 		Fname = fname;
 	}

 	public String getLname() {
 		return Lname;
 	}

 	public void setLname(String lname) {
 		Lname = lname;
 	}
 	
 	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
     
     public String getDeptID() {
 		return DeptID;
 	}
    
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
	public String getBatchCode() {
		return BatchCode;
	}
	public void setBatchCode(String batchCode) {
		BatchCode = batchCode;
	}
    
    
	public String toString(){
		return "User Name: "+getUserName()+"/n"+"User Code: "+getBatchCode();
	}
    
    
    
    
}
