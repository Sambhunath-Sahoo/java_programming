package constructor;
import java.util.Scanner;

public class ConstructorOverloading {
	int a;
	int b;
	int c;
	ConstructorOverloading(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	
	ConstructorOverloading(int a, int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		int  c, d, e;
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		ConstructorOverloading obj1 = new ConstructorOverloading( c, d);
		ConstructorOverloading obj2 = new ConstructorOverloading( c, d, e);
	}

}
