package ReturnMoney;

public class Refund10VND implements RefundEachAmount{
	// nhà buôn hết tiền kia, chỉ còn mỗi mấy tờ 500k, 200k và 19k thui
	private int piece;
	private int remainder;
	private RefundEachAmount chain;
	
	public void setNextChain(RefundEachAmount _nextChain) {
		this.chain= _nextChain;
	}
	
	public void refund(RefundingAccount refundingAccount) {
		if (refundingAccount.getAmount() >=10) {			
			piece = refundingAccount.getAmount() /10;
			remainder= refundingAccount.getAmount() %10;
			System.out.println ("Refund " + piece + " pieces of 10k VND");
			if (remainder!=0) chain.refund(new RefundingAccount(remainder));
		} else this.chain.refund(refundingAccount); // lệnh lồng trong lệnh luôn hả?
	}
}

