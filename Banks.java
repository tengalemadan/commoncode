public class Banks {
	private static int custId;
	private String name;
	private String contact;
	private double balance;
	public Banks next;
	public Banks prev;

	public Banks() {
		super();
		custId++;
		next = null;
		prev =  null;
	}


	public Banks(String name, String contact, double balance) {
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


	public Banks getNext() {
		return next;
	}


	public void setNext(Banks next) {
		this.next = next;
	}

	

	public Banks getPrev() {
		return prev;
	}


	public void setPrev(Banks prev) {
		this.prev = prev;
	}


	@Override
	public String toString() {
		return "BanksF [name=" + name + ", contact=" + contact + ", balance=" + balance + "]";
	} 
	
}
