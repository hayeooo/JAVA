package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Person o) {
		// �̸� ���� �������� 1�� ����
		if (this.name.length()<o.name.length()) return 1;
		// ���� �������� 2�� ����
		if (this.age>o.age) return 1;
		// �̸� ���� �� 3�� ����
		return this.name.compareTo(o.name);
	}
	public String toString() {
		return "name: "+name+" age: "+age;
	}
	
}
public class SortTest {
	// Person ��ü ����
	public static void main(String[] args) {
		List<Person> arrList=new ArrayList<>();
		arrList.add(new Person("ab",10));
		arrList.add(new Person("b",10));
		arrList.add(new Person("a",10));
		arrList.add(new Person("b",12));
		Collections.sort(arrList);
		System.out.println(arrList);
		
	}

}
