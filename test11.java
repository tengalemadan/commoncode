import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		//String sc1=sc.next();
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			System.out.println(i+" "+s);
			i++;
		}

	}

}
