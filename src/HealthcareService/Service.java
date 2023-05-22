package HealthcareService;

import java.util.HashMap;
import java.util.Scanner;

public class Service {
	protected int curBillAmount;
	protected int serviceChoice;
	Scanner sc = new Scanner(System.in);
	protected HashMap<Integer, Integer> servicePrice = new HashMap<>(); // số lựa chọn, giá tiền option - price()

	public Service() {
		servicePrice.put(1, 100); // massage
		servicePrice.put(2, 70); // xông hơi
		servicePrice.put(3, 200); // gym
		servicePrice.put(4, 250); // nail
	}
	// public void ServiceOptions() {

	public int calculateBill(int option) {
		this.curBillAmount = this.curBillAmount + (servicePrice.get(option));
		return this.curBillAmount;
	}

	public int chooseService() {					
		
		do {
			System.out.println("Choose your service:" + "\n" + "1 for massaage" + "\n" + "2 for sauna" + "\n"
					+ "3 for gym coaching" + "\n" + "4 for nail");
			serviceChoice = Integer.parseInt(sc.nextLine());
		} while (serviceChoice > 4 || serviceChoice <= 0);
		
		return serviceChoice;
	}

	public boolean continueService() {
		String input;		
		System.out.println("Do you want to continue using another service? Pres Y or N");
		input = sc.nextLine();
		if (input.equalsIgnoreCase("N"))
			return false;
		return true;
	}
}