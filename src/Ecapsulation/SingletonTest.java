package Ecapsulation;
/*
 * Singleton pattern
 * ���� ���� ��ü�� �ʿ� ���� ���
 * ��ü�� ������ �ʿ䰡 ���� ��� = ���� ������ ��� ������ ���� ��ɸ� �ִ� ���(stateless�� ��ä)
 * */
public class SingletonTest {
	private static SingletonTest instance=new SingletonTest();
	private SingletonTest() {}
	private static SingletonTest getInstance() {
		return instance;
	}
}

