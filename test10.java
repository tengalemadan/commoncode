import java.util.*;
import java.util.stream.Stream;
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Stream<Double> stream=Stream.generate(Math::random).limit(5);
		stream.forEach(System.out::println);
				Stream.of(1,2,3,4).forEach(System.out::println);

	}

}
