import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SuperClass{
	String x="super";
	
	public void method() {
		System.out.println("super class method");
	}
}

class SubClass extends SuperClass{
	String x="sub";
	
	@Override
	public void method() {
		System.out.println("sub class method");
	}
}

public class Main {
	
	public static void main(String args[]) {
		SubClass subClass=new SubClass();
		SuperClass sub2=new SubClass();
		System.out.println(sub2.x);
		sub2.method();
		
		SuperClass superClass=subClass;
		System.out.println(superClass.x);
		superClass.method();
		
		
	}
	


}


