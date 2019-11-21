package lambda;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		int x ;
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter value for cube:");
			x=sc.nextInt();
			LambdaCube c=n->{System.out.println( n*n*n);}	;
			c.cube(x);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
