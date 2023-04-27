package Atm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
public class AtmOperationImpl implements AtmOperationInterf {

	  Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	
		 public Connection getConnect() {
		 String jdbc_Driver=" com.mysql.jdbc.cj.jdbc.Driver";
		 String  url="jdbc:mysql://localhost:3308/Atm";
		 String username="root";
		 String pwd=" root";
			
				try

				{
					Class.forName(jdbc_Driver);
					//System.out.println("------driver is loaded--------");
					Connection con = DriverManager.getConnection(url, username, pwd);
					System.out.println("");
					System.out.println("--------connection established--------");
					System.out.println(" ");
					return con;
				} catch (Exception e)

				{
					e.printStackTrace();
					return null;
				}

			}
	public void viewBalance() {
		
		System.out.println("Available Balance is : "+atm.getBalance());
	}

	
	public void withdrawAmount(double withdrawAmount) {
		  if(withdrawAmount%500==0) {
	            if (withdrawAmount <= atm.getBalance()) {
	                ministmt.put(withdrawAmount, " Amount Withdrawn");
	                System.out.println("Collect the Cash " + withdrawAmount);
	                atm.setBalance(atm.getBalance() - withdrawAmount);
	                viewBalance();
	            } else {
	                System.out.println("Insufficient Balance !!");
	            }
	        }
	        else {
	            System.out.println("Please enter the amount in multipal of 500");
	        }

	    }
		


	
	public void depositAmount(double depositAmount) {
		 ministmt.put(depositAmount," Amount Deposited");
	        System.out.println(depositAmount+" Deposited Successfully !!");
	        atm.setBalance(atm.getBalance()+depositAmount);
	        viewBalance();
		
	}

	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
		
	}

}
}
