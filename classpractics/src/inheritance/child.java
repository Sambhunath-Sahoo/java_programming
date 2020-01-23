package inheritance;

class father{
	int rollNo;
}

public class child extends father{
	int total;
	int age;
	void get() {
		rollNo = 101;
		age = 20;
		total = 53;
	}
	void show() {
		System.out.println("roll no "+ rollNo + " age is " + age + " and total is " + total);
	}

	public static void main(String[] args) {
		
		child obj = new child();
		obj.get();
		obj.show();
	}

}
