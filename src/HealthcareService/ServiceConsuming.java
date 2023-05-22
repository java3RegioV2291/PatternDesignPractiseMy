package HealthcareService;

import java.util.Scanner;

public class ServiceConsuming {

	public static void main(String[] args) {
//	int curBillAmount=0;
		int method;

		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		VisaPayment visaAccount = new VisaPayment();
		BankingPayment bankingAccount = new BankingPayment();
		visaAccount.init(1000);
		bankingAccount.init(500);

		while (service.continueService()) {

			service.calculateBill(service.chooseService());
		}
		System.out.println("Bill to pay: " +service.curBillAmount);		
		boolean result;
		
		// Khúc chọn strategy => chọn phương thức thanh toán: VISA hoặc Banking
		do {
			System.out.println("Choose payment method, press:"+ "\n" + "1 for VISA with cashBalance: " +visaAccount.cashBalance+ 
					"\n"+ "2 for Banking Account with cashBalance "+ bankingAccount.cashBalance);
			method = Integer.parseInt(sc.nextLine());
		} while (method < 0 || method > 2);
		if (method == 1) {			
			result =  visaAccount.checkPayable(service.curBillAmount);			
		} else
			result = (bankingAccount.checkLogin() && bankingAccount.checkPayable(service.curBillAmount));
		
		if (result == false) {
			System.out.println("Unsuccessful transaction due to lack of money");
			return;
		} else
			return;
	}
}
