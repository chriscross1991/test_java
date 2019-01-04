package Model;

public class Webdesigner {
	
	private String UserName;
	private String UserPassword;
    private String BatchCode;
    private String DeptID="1003";
    
    
    
   public  Webdesigner(){
   	 setUserName("");
   	 setUserPassword("");
   	 setBatchCode("");	 
   }
    
    
    public Webdesigner(String UN, String UP, String BC){
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
	public void setBatchCode(String batchCode) {
		BatchCode = batchCode;
	}

	public String toString(){
		return "User Name: "+getUserName()+"/n"+"User Code: "+getBatchCode();
	}
	
}
