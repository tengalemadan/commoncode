package lambda;
import java.util.*;

public class Stream3 {

	public static void main(String[] args) {
		
		Stream3 s=new Stream3();
		s.process();
	}
	
	void process()
	{
		List<Integer> l=Arrays.asList(1,6,0,8,36,87,3,9,7,63,8,35);
		l.stream().filter(this::isEven).forEach(System.out::println);
		
	}
	
	boolean isEven(int n)
	{
		return n%2==0;
	}
	public static void m1()
	{
		System.out.println("Method Reference  Demo");
	}

}
