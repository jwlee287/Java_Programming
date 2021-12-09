package ex05_06;

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
}
