package ex05_07;

public class Account {
	private String owner;
	private long balance;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}
	
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	public long withdraw(long amount) {
		balance -= amount;
		return balance;
	}
	
	public static void main(String[] args) {
		Account a1 = new Account("이정우", 5000);
		a1.deposit(5000);
		a1.withdraw(1000);
		System.out.println("잔액은 " + a1.balance + "원입니다.");
	}
}
