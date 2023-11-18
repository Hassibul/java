package inheritance_pratices;

public class Joy implements Love_1, Bewafa_1 {

	@Override
	public void getLove() {
		System.out.println("i love Nothing");

	}

	@Override
	public void getGuru() {
		System.out.println("i buy guru");

	}

	@Override
	public void getDog() {
		System.out.println("i love Dog");

	}

	@Override
	public void getCat() {
		System.out.println("i have cat");

	}

	public static void main(String[] args) {
		Joy obj = new Joy();
		obj.getLove();
		obj.getGuru();
		obj.getDog();
		obj.getCat();
	}

}
