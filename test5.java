import java.util.*;
public class test5 {

	public static void main(String[] args) 
    { 
  
       
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
  
        System.out.println("The distinct elements are :"); 
  
       
        list.stream().distinct().forEach(System.out::println); 
    } 

}
