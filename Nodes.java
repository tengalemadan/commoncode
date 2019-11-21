public class Nodes {
	private static int id;
	private String name;
	private String contact;
	

	public Nodes() {
		super();
		id++;
	}


	public Nodes(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}


	public static int getCustId() {
		return id;
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


	@Override
	public String toString() {
		return "Nodes [name=" + name + ", contact=" + contact + "]";
	} 
	
}
