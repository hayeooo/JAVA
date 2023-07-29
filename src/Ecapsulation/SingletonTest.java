package Ecapsulation;
/*
 * Singleton pattern
 * 여러 개의 객체가 필요 없는 경우
 * 객체를 구별할 필요가 없는 경우 = 수정 가능한 멤버 변수가 없고 기능만 있는 경우(stateless한 각채)
 * */
public class SingletonTest {
	private static SingletonTest instance=new SingletonTest();
	private SingletonTest() {}
	private static SingletonTest getInstance() {
		return instance;
	}
}

