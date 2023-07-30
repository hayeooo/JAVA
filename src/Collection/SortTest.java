package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonSorting implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// �̸� ���� �������� 1�� ����
		if (o1.name.length()<o2.name.length()) return 1;
		// ���� �������� 2�� ����
		if (o1.age>o2.age) return 1;
		// �̸� ���� �� 3�� ����
		return o1.name.compareTo(o2.name);
	}
	
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	/*
	 * Comparable implements
	@Override
	public int compareTo(Person o) {
		// �̸� ���� �������� 1�� ����
		if (this.name.length()<o.name.length()) return 1;
		// ���� �������� 2�� ����
		if (this.age>o.age) return 1;
		// �̸� ���� �� 3�� ����
		return this.name.compareTo(o.name);
	}
	*/
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
		Collections.sort(arrList, new PersonSorting());
		System.out.println(arrList);
		
	}

}
