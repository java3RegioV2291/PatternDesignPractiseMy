package Software;
import Device.SmartDevice;

public class BankingAppVer2 extends BankingApp{
	protected SmartDevice smartDevice;
	
	public BankingAppVer2 (SmartDevice _smartDevice) {
		super.smartDevice=_smartDevice;
	}
	public void sendNoti() {
		System.out.println("App banking tui mới được nâng cấp nè");
	}
}
