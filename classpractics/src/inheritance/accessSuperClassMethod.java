package inheritance;
class on{
	void show(){
		System.out.println("i am in super class :");
	}
}

class tw extends on{
	void show() {
		System.out.println("i am in sub class :");
	}
}

public class accessSuperClassMethod {

	public static void main(String[] args) {
		
		on obj = (on)new tw();		// access the sub class
		obj.show();
		on obj2 = new on();			// access the super class
		obj2.show();
//		tw obj3 = (tw)new on();
//		obj3.show2();

	}

}
