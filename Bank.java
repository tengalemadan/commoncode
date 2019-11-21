public class Bank {
	private static int custId;
	private String name;
	private String contact;
	private double balance;
	public Bank next;

	public Bank() {
		super();
		custId++;
		next=null;
	}


	public Bank(String name, String contact, double balance) {
		super();
		this.name = name;
		this.contact = contact;
		this.balance = balance;
	}


	public static int getCustId() {
		return custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Bank getNext() {
		return next;
	}


	public void setNext(Bank next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return "Bank [name=" + name + ", contact=" + contact + ", balance=" + balance + "]";
	} 
	
}
