package Collection;

import java.util.*;
import java.io.*;
/*
 * �� ��ü�� ������ ���� �� �ֵ��� equals �޼ҵ� ������
 * */
class User{
	public String name;
	public User(String name) {
		this.name=name;
	}
	public boolean equals(Object obj) {
		if (obj!=null && obj instanceof User) {
			User usr=(User)obj;
			return this.name.equals(usr.name);
		}
		return false;
	}
	public int hashCode() {
		return this.name.hashCode();
	}
}
public class Main {
	public static void main(String[] args) {
		Set<User> set=new HashSet<>();
		set.add(new User("h"));
		set.add(new User("h"));
		
		System.out.println(set.size());
	}
}
