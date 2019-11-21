import java.util.Scanner;

public class QueueImplementation {

	private static int rear ;
	private static int front;
	private static final int size = 3;
	private Node arr[] = new Node[size];

	public QueueImplementation() {
		rear=0;
		front=0;
	}
	
	public static boolean isFull() {
		 if(front==rear) {
			 front = 0;
			 rear = 0;
		 }
		if(front==size) {
			System.out.println("Queue is Overflow");
			return true;
		}
		else
			return false;
	}
	
	public static boolean isEmpty() {

		if(front == rear) {
			System.out.println("Queue is Underflow");
			return true;
		}	
		else
			return false;
	}
	public void push(String name,String contact) {
		Node b = new Node(name,contact);
		arr[front++] = b;
	}
	public Node pop() {
		Node b = new Node();
		b=arr[rear++];
		return b;
	}
	
	public Node peek() {
		Node b = new Node();
		b=arr[rear];
		return b;
	}
	
	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)){
			QueueImplementation queue = new QueueImplementation();
			boolean flag = true;
			while(flag) {
				System.out.println("Enter your choice : \n 1)PUSH \n 2)POP \n 3)PEEK \n 4)Exit");
				switch (sc.nextInt()) {
					case 1:
						if(!isFull()) {
							System.out.println("Enter cust name,contact,amount");
							queue.push(sc.next(),sc.next());
						}
						break;
					case 2:
						if(!isEmpty()) {
							Node b = queue.pop();
							System.out.println(b);
						}
						break;
					case 3:
						if(!isEmpty()) {
							Node b = queue.peek();
							System.out.println(b);
						}	
						break;
		
					case 4:
						flag = false;
						System.out.println("\nThank you!!!");
						break;
					default:
						System.out.println("Wrong choice!!!!!!!");
				}
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
