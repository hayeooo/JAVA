package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	private static File target=new File("");
	private static void write() {
		Person person=new Person("","","","");
		try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(target))){
			oos.writeObject(person);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void read() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(target))){
			Object readed=ois.readObject();
			
			if (readed!=null && readed instanceof Person) {
				Person casted=(Person)readed;
			}
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
