package string;

public class inBuildFunction {

	public static void main(String[] args) {
		
		String str = "       hello, my name is Vicky.   ";
		String str1 = "Vicky";
		String str2 = "Vicky";
		String name[] = str.split("m");
		
		System.out.println(str.charAt(5));
		System.out.println(str.length());
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,8));
		System.out.println(str.contains("Vicky"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.isEmpty());
		System.out.println(str.concat(str2));
		System.out.println(str.replace("Vicky", "Sambhu"));
		System.out.println(name);
		System.out.println(str.indexOf("m"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());

	}

}
