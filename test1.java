import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 
{
	public static void main(String []args)
	{
		List<Integer> number = Arrays.asList(2,3,4,5); 
		  
	    
		  // List<Integer> square
		//int square= number.stream().map(x -> x*x*x).reduce(0,(ans,i)->ans+i);
		                           //collect(Collectors.toList()); 
		Stream<Integer> square= number.stream().map(x -> x*x*x);
		   System.out.println(square);
	}
}
