package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
System.out.println("savingAccount");

}
public void fixed() {
	System.out.println("fixedDeposit");
	

}
public void deposit (int cash) {
	System.out.println("deposited csah is"+cash);
super.deposit(25000);
}
public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.savings();
	a.fixed();
	a.deposit(50000);
	
	
}

}
