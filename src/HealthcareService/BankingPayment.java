package HealthcareService;
import java.util.Scanner;
import java.util.HashMap;
public class BankingPayment implements PaymentMethod { 
	HashMap <Integer, Integer> userLoginData = new HashMap<>();
	{userLoginData.put (123,321);
	userLoginData.put (596,695);
	userLoginData.put (456,654);
	}
	public int cashBalance;
	private boolean isPayable;
	public BankingPayment() {		
	}
	public void init (int _cashBalance) {		
		this.cashBalance=_cashBalance;
	}
	public boolean checkLogin() {
		int accountNo;
		int passWord;
		System.out.println("Please input your account name");
		Scanner sc = new Scanner (System.in);
		accountNo = Integer.parseInt(sc.nextLine());
		System.out.println("Please input your password");		
		passWord = Integer.parseInt(sc.nextLine());
		if (passWord ==(userLoginData.get(accountNo))) return true; 
		return false;
	}
	public boolean checkPayable(int billAmount) {
		if (cashBalance>= billAmount) {
			System.out.println("Successful transaction by Banking, your remainder is: " + (this.cashBalance-billAmount ));
			isPayable= true;
		} 
		return this.isPayable;
	}
	
}
