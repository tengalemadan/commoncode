import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test8
{
  public static void main(String[] args)
  {
	  List<String> str=Arrays.asList("smita","sapana","dipali");
	  
	  List<String> st=str.stream().filter(sr -> sr=="smita").collect(Collectors.toList());
	  
	  System.out.println(st);
  }
}
