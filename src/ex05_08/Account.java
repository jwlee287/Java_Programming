package ex05_08;

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
		if(balance >= amount)
			balance -= amount;
		else
			System.err.println("잔액이 부족합니다.");
		return balance;
	}
}
