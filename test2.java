import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class test2
{
	 public static void main(String[] args) 
	    { 
	  
	        System.out.println("The stream after applying "
	                           + "the function is : "); 
	  
	        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
	  
	       
	        list.stream().map(number -> number * 3).forEach(System.out::print); 
	    } 
}
