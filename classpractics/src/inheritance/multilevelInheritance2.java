package inheritance;

class a{
	void show() {
		System.out.println("i am in base class");
	}
}

class b extends a{
	void show1() {
		System.out.println("i am in super class");
	}
	
	b(){
		super.show();
		System.out.println("i am in super class");
	}
}

class c extends b{
	c(){
		System.out.println("i am in sub class");
	}
}


public class multilevelInheritance2 {

	public static void main(String[] args) {
		c obj = new c();
		obj.show1();
		obj.show();
	}

}
