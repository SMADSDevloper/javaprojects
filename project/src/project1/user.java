package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class user {
	 static 	int user_id;
	 static String user_name;
	 static String user_login_name;
	 static String user_pwd;
  static  Connection con =main.con;
 static  Scanner  sa= new Scanner(System.in);
   public   static PreparedStatement pstm;
   public  static  ResultSet rstm;
	public user(int user_id, String user_name, String user_login_name, String user_pwd) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_login_name = user_login_name;
		this.user_pwd = user_pwd;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_login_name() {
		return user_login_name;
	}

	public void setUser_login_name(String user_login_name) {
		this.user_login_name = user_login_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public static void register()
	{
		try {
			System.out.println("user name");
			user_name=sa.next();
			System.out.println(" enter the  login  name");
			user_login_name= sa.next();
			System.out.println("enter user  password");
			user_pwd= sa.next();
			String  sql= " insert into user(user_name ,user_login_name,user_pwd)values(?,?,?)";
 pstm =  con.prepareStatement(sql);
  pstm.setString(1, "user_name");
  pstm.setString(2, "user_login_name");
  pstm.setString(3,"user_pwd");
  int x=pstm.executeUpdate();
   if(x>=0) 
   {
	   System.out.println(" register done !");
	   
   } else
	   System.out.println(" please  check  your details");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void login() {
		// TODO Auto-generated method stub
		
	}

}
