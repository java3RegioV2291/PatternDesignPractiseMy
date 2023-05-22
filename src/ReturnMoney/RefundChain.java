package ReturnMoney;

public class RefundChain {
	public RefundEachAmount chain1;
	public RefundEachAmount chain2;
	public RefundEachAmount chain3;
	public RefundChain() {
		// initialize the chain
		this.chain1 = new Refund500VND();
		this.chain2 = new Refund200VND();  
		this.chain3 = new Refund10VND();

		// set the chain of responsibility
		chain1.setNextChain(chain2); // set next chain r thì nó tự động kích hoạt chain tiếp theo luôn
		chain2.setNextChain(chain3);
	}

}
