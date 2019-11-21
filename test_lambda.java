
public class test_lambda 
{
 public static void main(String []args)
 {
	 lambda l1=(a,b)->{int sum=a+b;return sum;};
	 int result=l1.add(10, 20);
	 System.out.println(result);
 }
  
  
}
