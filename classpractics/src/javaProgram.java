class student{
	int rollNo = 46 , age=20;
	String Name = "vicky";
}

class mark extends student{
	double math, physics, daa, oops, dld;
	void takeMark(double math,double physics, double daa,double oops, double dld) {
		this.math = math ; this.physics = physics; this.daa = daa ; this.oops = oops ; this.dld = dld;
	}
}

class result extends mark{
	double percentage, grade;
	void calculate() {
		percentage = (super.math + super.physics + super.daa + super.oops + super.dld)/500;
		if (percentage >= 90) {
			System.out.println(" O grade");
		}
		else if(percentage >= 80) {
			System.out.println(" E grade");
		}
		else if(percentage >= 70) {
			System.out.println(" A grade");
		}
		else if(percentage >= 60) {
			System.out.println(" B grade");
		}
		else if(percentage >= 50) {
			System.out.println("you have failed this exam.");
		}
	}
}

public class javaProgram {

	public static void main(String[] args) {
		
		result obj = new result();
		obj.takeMark(40, 98, 99, 95, 33);
		obj.calculate();

	}

}