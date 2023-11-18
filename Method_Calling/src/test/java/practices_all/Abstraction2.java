package practices_all;

public class Abstraction2 extends Abstraction_Practices {

	@Override
	void getName() {
		System.out.println("My name is joy");

	}

	public static void main(String[] args) {
		Abstraction2 obj = new Abstraction2();
		obj.getName();
		obj.getHome();
	}
}
