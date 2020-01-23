package inheritance;

class one{
	int i = 10;
	void show() {
		System.out.println(i);
	}
}

class two extends one{
	int i = 20;
	void show() {
		System.out.println("from super class : " + super.i);
		System.out.println("from sub class : " + i);
	}
}

public class superKeyword {

	public static void main(String[] args) {
		
		two obj = new two();
		obj.show();

	}

}
