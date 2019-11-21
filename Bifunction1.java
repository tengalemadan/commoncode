

import java.util.function.BinaryOperator;

class person{
	String name;
	Integer age;
	
	public person(String name, Integer age){
		this.name=name;
		this.age=age;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Integer getAge() {
		return age;
	}
 
	public void setAge(Integer age) {
		this.age = age;
	}
}
 
public class Bifunction1 {
	public static void main(String[] args) {
		BinaryOperator<person> getYoungerPerson = (person1,person2)->{
			if(person1!=null && person2!=null){
				if(person1.getAge()>person2.getAge()){
					return person2;
				} else {
					return person1;
				}
			}
			return null;
		};	
		
		person person1 = new person("Kathy",34);
		person person2 = new person("Tom",23);
		
		person result = getYoungerPerson.apply(person1, person2);
		
		System.out.println("Younger Person : "+result.getName());
	}
}