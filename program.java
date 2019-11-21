/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person
{
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name,int age,String gender) 
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
public class program {

	public static void main(String[] args)
	{
		Person p1=new Person("smita",23,"female");
		Person p2=new Person("sapana",22,"female");
		Person p3=new Person("dipali",24,"female");
		ArrayList<Person> l1=new ArrayList<Person>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		List<Boolean> s1=l1.stream().map(x ->"smita".equals(x.getName())).collect(Collectors.toList());
		System.out.println(s1);
		
		
	}

}*/
