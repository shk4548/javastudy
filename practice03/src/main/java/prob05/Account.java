package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	// 생성자
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	
	
	// 메서드
	public void save(int money) {
		balance += money;
	}
	
	public void deposit(int money) {
		balance  -= money;
	}
	
	// setter / getter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
