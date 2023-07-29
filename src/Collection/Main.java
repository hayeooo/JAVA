package Collection;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		List<Integer> arrList=new ArrayList<>();
		arrList.add(0);
		arrList.add(2);
		arrList.add(1);
		arrList.add(2);
		
		arrList.remove(1);
		System.out.println(arrList);
	}
}
