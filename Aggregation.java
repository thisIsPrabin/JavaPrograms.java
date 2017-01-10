package practice1;

//Reusability of the code

class Person{
	int id;
	String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Emp{
	
	String city;
	String country;
	Person person;
	
	public Emp(String city, String country, Person person){
		this.city = city;
		this.country = country;
		this.person = person;
	}
	
	public String getData(){
		return person.id+" "+person.name+"\n"+city+" "+country;
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Person p1 = new Person(100, "Prabin");
		Emp e1 = new Emp("Jaipur", "India", p1);
		
		Person p2 = new Person(101, "Riju");
		Emp e2 = new Emp("Jaipur", "India", p2);
		
		System.out.println(e1.getData());
		System.out.println(e2.getData());
	}
}
