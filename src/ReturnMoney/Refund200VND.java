package ReturnMoney;

public class Refund200VND implements RefundEachAmount {

	private int piece;
	private int remainder;
	private RefundEachAmount chain;

	public void setNextChain(RefundEachAmount _nextChain) {
		this.chain = _nextChain;
	}

	public void refund(RefundingAccount refundingAccount) {
		if (refundingAccount.getAmount() >= 200) {
			piece = refundingAccount.getAmount() / 200;
			remainder = refundingAccount.getAmount() % 200;
			System.out.println("Refund " + piece + " pieces of 200k VND");
			if (remainder != 0)
				chain.refund(new RefundingAccount(remainder));
		} else
			this.chain.refund(refundingAccount); // lệnh lồng trong lệnh luôn hả?
	}
}
