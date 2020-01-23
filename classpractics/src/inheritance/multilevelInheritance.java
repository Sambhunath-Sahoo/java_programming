package inheritance;

class x{
	void show() {
		System.out.println("i am in base class.");
	}
}

class y extends x{
	void show() {
		super.show();
		System.out.println("i am in super class.");
	}
}

class z extends y{
	void show() {
		super.show();
		System.out.println("i am in sub class.");
	}
}

public class multilevelInheritance {

	public static void main(String[] args) {
		z obj = new z();
		obj.show();
		}

}
