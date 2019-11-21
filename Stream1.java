package lambda;
import java.util.*;
public class Stream1 {

	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(10,20,30,40,50);
		//System.out.println(l.stream().filter(x->x%2!=0).map(x->x*x).findAny());
		
		//l.stream().filter(x->x%2!=0).map(x->x*x).forEach(System.out::println);
		l.stream().map((n)->{if(n>10) return n*n; else if(n<20) return n*n*n; else return n;}).forEach(System.out::println);
		
		
	}

}
