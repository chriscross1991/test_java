package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Controller.ControlUnit;


public class Layout extends JFrame implements ActionListener{

	private ControlUnit CU;
	
	private JButton login_btn,DBA_btn,ACC_btn,WD_btn;
	
	private JLabel login_lbl,userID_lbl,username_lbl,userpassword_lbl;
	
	private JTextField userID_txt,username_txt,userpassword_txt;
	
	private JPanel top_pnl,mid_pnl,mid_pnl2,bot_pnl;
	
	
	public void initializeComponent(){
		login_btn = new JButton("Login");
        DBA_btn = new JButton("DatabaseAdministrator");
        ACC_btn = new JButton("Accountant");
        WD_btn = new JButton("WebDesigner");
     
        login_lbl = new JLabel("LOGIN");
        userID_lbl = new JLabel("User ID"); 
        username_lbl = new JLabel("User Name: ");
        userpassword_lbl = new JLabel("Password: ");
        
        userID_txt = new JTextField();
        username_txt = new JTextField();
        userpassword_txt = new JTextField();
        
        top_pnl = new JPanel(new FlowLayout());
        mid_pnl = new JPanel(new FlowLayout());
        mid_pnl2 = new JPanel(new FlowLayout());
        bot_pnl = new JPanel(new FlowLayout());
	}
	
	
	public void addComponent(){
		top_pnl.add(ACC_btn);
		top_pnl.add(DBA_btn);
		top_pnl.add(WD_btn);
		
		
		mid_pnl.add(userID_lbl);
		mid_pnl.add(userID_txt);
		userID_txt.setPreferredSize( new Dimension(200, 30));
		
		
		mid_pnl.add(username_lbl);
		mid_pnl.add(username_txt);
		username_txt.setPreferredSize( new Dimension(200, 30));
		
		
		mid_pnl2.add(userpassword_lbl);
		mid_pnl2.add(userpassword_txt);
		userpassword_txt.setPreferredSize(new Dimension(200, 30));
		
		bot_pnl.add(login_lbl);
		bot_pnl.add(login_btn);
		
	}
	

	public void addPanel(){
		
	 this.add(top_pnl);
	 
	 this.add(mid_pnl);
	 this.add(mid_pnl2);
	 
	 this.add(bot_pnl);
		
	}
	
	
	public void windowsProperties(){
		
		this.setLayout(new GridLayout(4,4));
		
		this.setTitle("OFFICE PACK");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(600,300);
		
	}
	
	
	public void addActionListener(){
		
		ACC_btn.addActionListener(this);
		DBA_btn.addActionListener(this);
		WD_btn.addActionListener(this);
		login_btn.addActionListener(this);
		
	}
	
	
	public Layout(ControlUnit cu){
		
		this.CU = cu;
		
		initializeComponent();
		addPanel();
		addComponent();
		windowsProperties();
		addActionListener();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		 
		if(event.getSource()==ACC_btn){
			JOptionPane.showMessageDialog(this, "Accountant employees");
	        CU.Selectdept("1001");
		}
		
        if(event.getSource()==DBA_btn){
        	JOptionPane.showMessageDialog(this, "DataBase Administrator employees");
        	 CU.Selectdept("1002");
		}
        
       if(event.getSource()==WD_btn){
    	   JOptionPane.showMessageDialog(this,"Web Design employees");
    	   CU.Selectdept("1003");
        }   
       
       if(event.getSource()==login_btn){		
    	   CU.LoginUser( userID_txt.getText(),username_txt.getText(),userpassword_txt.getText() );	   
		}	
	}


	public void showinfo(String userName) {
		
		JOptionPane.showMessageDialog(this, "User Name: "+userName);	
	}
	
   public void showdept(String id) {
		
		JOptionPane.showMessageDialog(this, "Department ID : "+id);	
	}

  public void showerrorlogin(String id) {
	
	JOptionPane.showMessageDialog(this, "THE "+id+" FEILD IS BLANK");
  }
  
  public void showuser_data_infor(String address) {
	  JOptionPane.showMessageDialog(this, "THE user address is "+address+" ");  
  }

  public void clearFeilds() {
	 userID_txt.setText(""); 
	 username_txt.setText("");
	 userpassword_txt.setText("");
  }

}
