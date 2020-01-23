package inheritance;

class shape{
	int a = 10, b = 100, c = 13;
}

class square extends shape{
	int x, y, z;
	void reactangle() {
		x = super.a;
		y = super.b;
		System.out.println(x*y);
	}
	void areasquare(int a) {
		z = super.a;
		System.out.println(z*z);
	}
}
public class area {

	public static void main(String[] args) {
		square s = new square();
		s.areasquare(5);
		s.reactangle();
		

	}

}
