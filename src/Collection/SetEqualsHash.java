package Collection;

import java.util.HashSet;
import java.util.Set;

class SmartPhone{
	String number;
	String name="��";
	public SmartPhone(String number) {
		this.number=number;
	}
	public String toString() {
		return "��ȭ ��ȣ: "+number;
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
	// Set�� ����� ���� hashCode �ʼ�
	// HashTable, HashSet, HashMap�� ���� �ڷᱸ���� �ڷḦ �����ϱ� ���� ��ġ�� �����ϱ� ���� hashCode ���
	@Override
	public int hashCode() {
		// int ���·� ��ȯ���ֱ⸸ �ϸ� ��.
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
