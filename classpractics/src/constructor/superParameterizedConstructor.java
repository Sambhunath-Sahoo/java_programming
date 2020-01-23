package constructor;

class one{
	int i ;
	one(){}
	one(int a){
		System.out.println(a);
	}
}

class two extends one{
	int i;
	two(){}
	two(int a, int b) {
		super(a);
		i = b;
		System.out.println(i);
	}
	
}

public class superParameterizedConstructor {

	public static void main(String[] args) {
		
		two obj = new two(11,22);

	}

}
