package Collection;

class SmartPhone{
	String number;
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
			result=(this.number.equals(param.number));
		}
		return result;
	}
	@Override
	public int hashCode() {
		return number.hashCode();
	}
}
public class SetEqualsHash {

}
