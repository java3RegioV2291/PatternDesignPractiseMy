package ReturnMoney;

public class Refund500VND implements RefundEachAmount{
	private int piece;
	private int remainder;
	private RefundEachAmount chain;
	public void setNextChain(RefundEachAmount _nextChain) {
		this.chain= _nextChain;
	}
	
	public void refund(RefundingAccount refundingAccount) {
		if (refundingAccount.getAmount() >=500) {			
			piece = refundingAccount.getAmount() /500;
			remainder= refundingAccount.getAmount() %500;
			System.out.println ("Refund " + piece + "pieces of 500k VND");
			if (remainder!=0) chain.refund(new RefundingAccount(remainder));
		} else this.chain.refund(refundingAccount); // lệnh lồng trong lệnh luôn hả? // đẩy qua bước kế tiếp
	}
}
