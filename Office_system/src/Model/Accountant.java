package Model;

public class Accountant {

	
	private String UserName;
	private String UserPassword;
    private String BatchCode;
    private String DeptID="1001";
    
    


	public Accountant(){
   	 setUserName("");
   	 setUserPassword("");
   	 setBatchCode("");	 
   }
    
    
     public Accountant(String UN, String UP, String BC){
    	 setUserName(UN);
    	 setUserPassword(UP);
    	 setBatchCode(BC);	 
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
	public void setBatchCode(String Batchcode) {
		BatchCode = Batchcode;
	}
	
	public String toString(){
		return "User Name: "+getUserName()+"User Code: "+getBatchCode();
		
		
	}
	
}
