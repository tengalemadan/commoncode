import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class test3
{
	public static void main(String[] args)
	  {
		List<Integer> number = Arrays.asList(2,3,4,5); 
		List<Integer> even = number.stream().filter(x->x%2==0).collect(Collectors.toList());//.reduce(0,(ans,i)-> ans+i); 
			  
			    System.out.println(even); 
	  }
}
