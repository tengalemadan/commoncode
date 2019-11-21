import java.util.*;
public class test6 
{
   public static void main(String[] args)
   {
	
       List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
 
       System.out.println("The sorted stream is : "); 
 
       
       list.stream().sorted().forEach(System.out::println); 
   }
}
