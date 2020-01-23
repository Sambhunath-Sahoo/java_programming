package constructor;
import java.util.Scanner;

public class area {
	int a,b;
	
	area(int a){	
		System.out.println("the area of the circle is :" + 2*3.141*a);	
	}
	
	area(int a,int b){
		System.out.println("the area of the reactangle is :" + a*b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		area obj1 = new area( a);
		area obj2 = new area( a, b);		
	}

}
