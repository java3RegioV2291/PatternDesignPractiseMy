package HealthcareService;

public interface PaymentMethod {
	
	boolean checkPayable(int amount);
	public void init (int _cashBalance);	      
}
