package FileIO;

import java.io.Serializable;
import java.util.List;

class Person implements Serializable{
	private String id;
	private transient String pass;
	private Address addr;
	private List<Integer> list;
	
	public Person(String id, String pass, String zipCode, String city) {
		this.id=id;
		this.pass=pass;
		this.addr=new Address(zipCode,city);
	}
	
	class Address implements Serializable{
		private String zipCode;
		private String city;
		
		public Address(String zipCode, String city) {
			this.zipCode=zipCode;
			this.city=city;
		}
	}
	
	
}
public class Serialization {
	public static void main(String[] args) {
		Person p=new Person("","","","");
		if (p instanceof List<?>) {
			
		}
	}
}
