package constructor;

public class staticMethod {
	static int sum(int a, int b) {
		return(a+b);
	}
	
	public static void main(String[] args) {
		 int add = staticMethod.sum(3, 5);
		 System.out.println(add);

	}

}
