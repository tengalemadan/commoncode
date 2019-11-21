import java.util.Scanner;

public class SingleLinkedListImplementation{
	
	private Bank head;
		
	public SingleLinkedListImplementation() {
		head = null;
	}
	
	
	
	
	public void insertAtFront(Bank new_node) {
		if(head == null) {
			head=new_node;
		}else {
			new_node.next=head;
			head=new_node;
		}
	}	
	
	
	
	
	public void insertAtEnd(Bank new_node) {
		Bank trav = new Bank();
		trav = head;
		if(trav==null)
			head = new_node;
		
		else{
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next=new_node;
		}
	}
	
	
	

	public void deleteFromEnd() {
		Bank trav = new Bank();
		Bank trav1 = new Bank();
		
		if( head == null){
			System.out.println("List is Empty");
		}
		else if(head.next == null) {
			head = null ;	
		}
		else {
				trav = head;
				while(trav.next != null) {
					trav1=trav;
					trav = trav.next;
				}
			trav1.next = null;
		}
	}


	public Bank deleteFromFront() {
		Bank b = head;
		if(b == null) {
			System.out.println("List is Empty");
			return null;
		}else {
			head = head.next;
			//previous head memory is free or not?
			return b;
		}
	}
	
	
	
	
	
	
	public void printAll() {
		Bank trav = new Bank();
		trav = head;
		if(trav==null)
			System.out.println("List is empty");
		else if(trav.next == null){
			System.out.println(head);
		}
		else{
			while(trav != null) {
				System.out.println(trav);
				trav = trav.next;
			}
		}
	}
	
	public static void main(String []args) {
		boolean flag = true;
		Bank new_node ;
		SingleLinkedListImplementation obj = new SingleLinkedListImplementation();
		try(Scanner sc = new Scanner(System.in)){
			while(flag) {
				System.out.println("Enter : \n 1)Insert at Beggining \n 2)Insert at End \n "
						+ "3)Delete from end \n 4)Delete from beggining \n 5) PrintAll\n 6) Exit");
				switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name,contact,amount");
						new_node = new Bank(sc.next(),sc.next(),sc.nextDouble());
						obj.insertAtFront(new_node);
						break;
					case 2:
						System.out.println("Enter name,contact,amount");
						new_node = new Bank(sc.next(),sc.next(),sc.nextDouble());
						obj.insertAtEnd(new_node);					
						break;
					case 3:
						obj.deleteFromEnd();	
						break;
					case 4:
						new_node = obj.deleteFromFront();	
						System.out.println(new_node + " is deleted");
						break;
					case 5:
						obj.printAll();
						break;
					case 6:
						flag = false;
						break;					
					default:
						System.out.println("Wrong input");
						break;
				}
			}
			System.out.println("Thank you");
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}