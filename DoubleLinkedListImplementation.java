import java.util.Scanner;

public class DoubleLinkedListImplementation{
	
	private Banks head;
	private Banks tail;	
	
	public DoubleLinkedListImplementation() {
		head = null;
		tail = null;
	}
	
	public void insertAtFront(Banks new_node) {
		if(head == null) {
			head = new_node;
			tail = new_node;
		}else {
			new_node.next=head;
			head.prev = new_node;
			head = new_node;
		}
	}	
	
	public void insertAtEnd(Banks new_node) {
		if(head == null) {
			head = new_node;
			tail = new_node;
		}else {
			tail.next=new_node;
			new_node.prev = tail;
			tail = new_node;
		}		
	}
	
	public void deleteFromEnd() {
		if(tail == null) {
			System.out.println("List is empty");
		}
		else if(tail.prev == null) {
			tail = null;
			head = null;
		}
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}


	public void deleteFromFront() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		else if(head.next == null) {
			tail = null;
			head = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
		
	public void printAllFromFront() {
		Banks trav = new Banks();
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
		Banks new_node ;
		DoubleLinkedListImplementation obj = new DoubleLinkedListImplementation();
		try(Scanner sc = new Scanner(System.in)){
			while(flag) {
				System.out.println("Enter : \n 1)Insert at Beggining \n 2)Insert at End \n "
						+ "3)Delete from end \n 4)Delete from beggining \n 5) PrintAll\n 6) Exit");
				switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name,contact,amount");
						new_node = new Banks(sc.next(),sc.next(),sc.nextDouble());
						obj.insertAtFront(new_node);
						break;
					case 2:
						System.out.println("Enter name,contact,amount");
						new_node = new Banks(sc.next(),sc.next(),sc.nextDouble());
						obj.insertAtEnd(new_node);					
						break;
					case 3:
						obj.deleteFromEnd();	
						break;
					case 4:
						obj.deleteFromFront();	
						break;
					case 5:
						obj.printAllFromFront();
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