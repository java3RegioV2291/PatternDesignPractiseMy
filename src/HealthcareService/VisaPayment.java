package HealthcareService;

public class VisaPayment implements PaymentMethod {
	public int cashBalance;
	private boolean isPayable;
	public VisaPayment() {
		
	}
	public void init (int _cashBalance) {
		this.cashBalance= _cashBalance;
	}
	public boolean checkPayable(int billAmount) {
		if (cashBalance>= billAmount) {
			System.out.println("Successful transaction by Visa Card, your remainder is: " + (this.cashBalance-billAmount ));
			this.isPayable= true;
		} 
		return this.isPayable;
	}
	//void signIn();
}
