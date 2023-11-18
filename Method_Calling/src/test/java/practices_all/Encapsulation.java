package practices_all;

public class Encapsulation {

	private String name = "joy";
	private int age = 21;

	private String getName() {
		return name;
	}

	private int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
