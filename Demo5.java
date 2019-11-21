package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		
		Person p1= new Person(1000, "Rakesh", "Sharma");
		Person p2= new Person(1001, "Akash", "patil");
		Person p3= new Person(1000, "Dharma", "Barfa");
		List<Person> l= new ArrayList<Person>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		for (Person person : l) {
			System.out.println(person);
		}
		
/*		Collections.sort(l,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLname().compareTo(o2.getLname());
			}
		});
*/
		Collections.sort(l,(Person o1,Person o2)-> o1.getLname().compareTo(o2.getLname()));
		
		

		System.out.println("After Sort... ");
		
		for (Person person : l) {
			System.out.println(person);
		}
		
		
		
	}

}
