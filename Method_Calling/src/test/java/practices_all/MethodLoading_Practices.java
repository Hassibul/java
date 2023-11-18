package practices_all;

public class MethodLoading_Practices {

	public void getName(String name) {
		System.out.println("my name is " + name);

	}

	public void getName(int salary) {
		System.out.println("my salary is " + salary);

	}

	public void getName(String name, int salary) {
		System.out.println("my name is " + name + "my salary is " + salary);

	}

	public static void main(String[] args) {
		MethodLoading_Practices a = new MethodLoading_Practices();
		a.getName("joy");
		a.getName(100000);
		a.getName("Hassibul", 50000);

	}

}
