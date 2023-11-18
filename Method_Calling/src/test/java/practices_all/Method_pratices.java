package practices_all;

public class Method_pratices {
	String getNam() {
		String Name = "joy";
		int Phone_Number = 1234567899;
		System.out.println(Name);
		System.out.println(Phone_Number);
		return Name + Phone_Number;

	}

	public static void main(String[] args) {
		Method_pratices getNam = new Method_pratices();
		getNam.getNam();

	}
}
