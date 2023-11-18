package practices_all;

public class Return_Method {

	public String getName() {

		String Name = "Hassam";
		String Address = "115 cortelyou rd";
		int Phone_Number = 123456789;
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Phone_Number);
		return Address + Name + Phone_Number;
	}

	public static void main(String[] args) {
		Return_Method Info = new Return_Method();
		Info.getName();
	}

}
