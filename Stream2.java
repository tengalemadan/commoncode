package lambda;
import java.util.*;
import java.util.stream.Collectors;
public class Stream2 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("abcfg");
		l1.add("pqrg");
		l1.add("xyz");
		l1.add("mn");
		for (String string : l1) {
			System.out.println(string);
		}
		
		System.out.println("After stream opertion");
		List<String> l2=l1.stream().sorted().collect(Collectors.toList());
		
		for (String string : l2) {
			System.out.println(string);
		}
	}

}
