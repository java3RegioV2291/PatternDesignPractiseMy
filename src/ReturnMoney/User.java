package ReturnMoney;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		RefundChain refundMoneyChain = new RefundChain();
		//boolean test = false;
		while (true) {  
			int refundAmount;
			System.out.println("Enter amount to refund");
			Scanner input = new Scanner(System.in);
			refundAmount = input.nextInt();
			if (refundAmount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10k VND.");
			} 		
			// process the request
			(refundMoneyChain.chain2).refund(new RefundingAccount(refundAmount)); 
			// TÊN CHAIN. refund (truyền obj vào (para là amount))
			// Nếu hết tiền 500k thì gọi chain 2 để thối 200k
			// Túng nữa thì gọi chain 3 để thối 10k thui
		}
	}

}
