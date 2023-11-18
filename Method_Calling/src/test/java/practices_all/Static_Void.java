package practices_all;

public class Static_Void {

	void getAddress() {
		String Name = "Alam";
		String Car = "BMW";
		int Year = 2024;
		System.out.println(Name);
		System.out.println(Car);
		System.out.println(Year);
	}

	public static void main(String[] args) {
		Static_Void info = new Static_Void();
		info.getAddress();
	}
}
