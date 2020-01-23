package inheritance;

abstract class myclass{
	abstract void cat(int x);
}

class sub1 extends myclass {
	void cal(int x) {
		System.out.println("Square : " + x*x);
	}

	@Override
	void cat(int x) {
		// TODO Auto-generated method stub
		
	}
}

class sub2 extends myclass{
	void cal(int x) {
		System.out.println("cube: " + x*x*x);
	}

	@Override
	void cat(int x) {
		// TODO Auto-generated method stub
		
	}
	
}

class sub3 extends myclass{
	void cal(int x) {
		System.out.println("squareroot: " + Math.sqrt(x));
	}

	@Override
	void cat(int x) {
		// TODO Auto-generated method stub
		
	}
	
}

public class abstractClass {

	public static void main(String[] args) {
		
		sub1 obj1 = new sub1();
		sub2 obj2 = new sub2();
		sub3 obj3 = new sub3();
		
		obj1.cal(3);
		obj2.cal(45);
		obj3.cal(100);
		
	}

}
