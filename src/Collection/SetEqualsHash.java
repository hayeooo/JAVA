package Collection;

import java.util.HashSet;
import java.util.Set;

class SmartPhone{
	String number;
	String name="김";
	public SmartPhone(String number) {
		this.number=number;
	}
	public String toString() {
		return "전화 번호: "+number;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if (obj!=null && obj instanceof SmartPhone) {
			SmartPhone param=(SmartPhone)obj;
			//System.out.println(this.number==param.number);
			result=(this.number.equals(param.number));
		}
		return result;
	}
	// Set을 사용할 때는 hashCode 필수
	// HashTable, HashSet, HashMap과 같은 자료구조는 자료를 저장하기 위한 위치를 선택하기 위해 hashCode 사용
	@Override
	public int hashCode() {
		// int 형태로 반환해주기만 하면 됨.
		return (number+name).hashCode();
	}
}
public class SetEqualsHash {
	public static void main(String[] args) {
		Set<SmartPhone> set=new HashSet<>();
		set.add(new SmartPhone("010"));
		set.add(new SmartPhone("010"));
		System.out.println(set.size());
	}
}
