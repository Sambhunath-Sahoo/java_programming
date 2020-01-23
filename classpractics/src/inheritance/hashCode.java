package inheritance;

public class hashCode {
	String Name;
	int id;
	
	void get() {
		System.out.println(Name +" "+ id);
	}

	public static void main(String[] args) {
		 
		hashCode obj = new hashCode();
		obj.get();
		
	System.out.println(obj.hashCode());
		

	}

}
