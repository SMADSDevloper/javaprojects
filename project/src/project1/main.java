package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class main {
public  static Connection con;

public static void main(String[] args)  {
	
	 try {
		 Scanner sa= new Scanner(System.in);
		 //------------------------------------- jdbc  connection-----------------//
		 Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/project","root","root");
	 //-------------------------------------------------------------//
	
	 System.out.println(" welcome  to Devi Supermarket");
	 System.out.println("");
	System.out.println("please select  an  option \n 1.Register \n 2.login \n");
 int  choice =  sa.nextInt();
  if ( choice==1) {
	  System.out.println(" welcome  to  register page please  ");
   user.register();
   main(null);
  }
  else if ( choice==2) {
	  System.out.println(" enter the  login  crediantials");
	  System.out.println(" ");
	  user.login();
	  main(null);
	  
  }
  else 
System.out.println("thank you  for   shopping");
  System.exit(0);
	  
 

} catch (Exception e) {
	e.printStackTrace();
}
}
}


