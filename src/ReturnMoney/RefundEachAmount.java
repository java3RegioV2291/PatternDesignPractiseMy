package ReturnMoney;

public interface RefundEachAmount {	

		void setNextChain(RefundEachAmount nextChain);
		
		void refund (RefundingAccount _refunndingAccount);
}
