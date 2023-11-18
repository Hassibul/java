package inheritance_pratices;

public class Hassibul extends Alam {

	public void getMoney() {
		System.out.println("get money from dad");
	}

	public static void main(String[] args) {
		Hassibul obj = new Hassibul();
		obj.getCar();
		obj.getHouse();
		obj.getMoney();

	}
}
