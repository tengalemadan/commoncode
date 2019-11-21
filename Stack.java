import java.util.Scanner;

public class Stack
{
    //int index;
	int top;   
    int size = 5;  
    int[] a = new int[size];  
    
    public Stack() {
		// TODO Auto-generated constructor stub
	}
    
   
    public Stack(int size) {
		
		this.size = size;
	}


	boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    public boolean isfull()
    {
    	if(top == this.size-1)
    	{
    		return true;
    	}
		return false;
    	
    }
    public void Push(Scanner sc)
    {
    	  if(top == this.size-1)  
          {  
              System.out.println("Overflow !!");  
              
          }  
          else   
          {  
              System.out.println("Enter Value");  
              int val = sc.nextInt();  
              top++;  
              a[top]=val;  
             
              
          }  
    	
    }
    public void pop()
    {
    	if(this.isEmpty())
    	{
    		System.out.println("Stack is empty");
    	}
    	else
    	{
    		top--;
    		System.out.println("element is poped successfully");
    	}
    }
    public void peek()
    {
    	if(this.isEmpty())
    	{
    		System.out.println("Stack is empty");
    	}
    	else
    	{
    		System.out.println("top most element is"+this.a[top]);
    	}
    }
    public static void main(String[] args) {  
        int choice=0;  
        Scanner sc = new Scanner(System.in);  
        Stack s = new Stack(5);  
     
        while(choice != 5)  
        {  
            System.out.println("\nChose one from the below options...\n");  
            System.out.println("\n1.Push\n2.Pop\n3.peek\n4.display\n5.Exit");  
            System.out.println("\n Enter your choice \n");        
            choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                {  
                	 
                    s.Push( sc);  
                    break;  
                }  
                case 2:  
                {  
                    s.pop();  
                    break;  
                }  
                case 3:  
                {  
                    s.peek();  
                    break;  
                }  
                
                case 4:   
                {  
                	System.out.println("Printing stack elements .....");  
                    for(int i=s.top; i>=0;i--)  
                    {  
                        System.out.println(s.a[i]);  
                    }  
                    break;
                }  
                case 5:   
                {  
                    
                    System.exit(0);  
                    break;   
                }  
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            };  
        }  
    }  
    }  

