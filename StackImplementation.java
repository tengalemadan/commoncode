import java.util.Scanner;
public class StackImplementation {
	private static int top;
	private static final int max = 5;
	private Nodes arr[] = new Nodes[max];
	
	public StackImplementation() {
		top = -1;
	}
	
	public static boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is Underflow");
			return true;
		}	
		else
			return false;
	}
	
	public static boolean isFull() {
		if(top == max-1) {
			System.out.println("Stack is Overflow");
			return true;
		}else
			return false;
	}
	
	
	public void push(String name,String contact ) {
		Nodes b = new Nodes(name,contact);
		arr[++top] = b;
	}
	
	public Nodes pop() {
		return arr[top--];
	}
	public Nodes peek() {
		return arr[top];
	}
		
	
	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)){
			StackImplementation stack = new StackImplementation();
			boolean flag = true;
			while(flag) {
				System.out.println("Enter your choice : \n 1)PUSH \n 2)POP \n 3)PEEK \n 4)Exit");
				switch (sc.nextInt()) {
					case 1:
						if(!isFull()) {
							System.out.println("Enter name,contact");
							stack.push(sc.next(),sc.next());
						}
						break;
					case 2:
						if(!isEmpty()) {
							Nodes b = stack.pop();
							System.out.println(b);
						}
						break;
					case 3:
						if(!isEmpty()) {
							Nodes b = stack.peek();
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
