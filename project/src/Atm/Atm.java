
public class Atm {
	
	// deposit, ministatement,check balance
	
	 private double balance;
	    private double depositAmount;
	    private double withdrawAmount;
	    Atm(){
	    	
	    }
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getDepositAmount() {
			return depositAmount;
		}
		public void setDepositAmount(double depositAmount) {
			this.depositAmount = depositAmount;
		}
		public double getWithdrawAmount() {
			return withdrawAmount;
		}
		public void setWithdrawAmount(double withdrawAmount) {
			this.withdrawAmount = withdrawAmount;
		}
	    

}