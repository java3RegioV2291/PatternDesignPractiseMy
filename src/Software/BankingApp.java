package Software;
import Device.SmartDevice;
public class BankingApp implements Software1 {
	protected SmartDevice smartDevice;
	private long cashBalance;
	public BankingApp() {
		
	}
	public BankingApp (SmartDevice _smartDevice1) {
		this.smartDevice=_smartDevice1;
	}
	public void runTransaction() {
		if (this.smartDevice.hasWifi()) {
			System.out.println("This transaction in banking app is processing");
		} else System.out.println("This transaction in banking appp can not be processed");
		
	}
	public void checkTransaction(int debit) {
		if ((this.cashBalance>0) && (debit<cashBalance)) {
			System.out.println("Valid transaction");
		} else System.out.println("Invalid transaction, not enough money!");
		
	}
}
