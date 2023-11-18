package practices_all;

public class Static_Calling {

	static String getInfo() {

		String Name = "Hasibul";
		int SSN = 1234567890;

		System.out.println("Name" + Name + "    " + "SSN" + SSN);
		// System.out.println(SSN);

		return Name + SSN;

	}

	public static void main(String[] args) {
		Static_Calling.getInfo();

	}
}