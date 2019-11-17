package numberinput;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		//comparison operator
		//< > <= >= == !=
		
		int a=20;
		int b=3;
		if(b>a) {
			System.out.println("b is grater then a");
		} 
		else {
		System.out.println("a is grater then b");	
		}
		
		int i=10;
		int s=20;
		if(i == s) {
			System.out.println("i and s both are equal");
		}
		else {
			System.out.println("i and s both are not equal");
		}
		
		int x=400;
		int y=500;
		int z=300;
		int d=800;
		if(x>y & x>z &x>d) {
			System.out.println("x is the bigest");
		}
		else if(y>z & y>d) {
			System.out.println("y is the bigest");
		}
		else if(z>d) {
			System.out.println("z is the bigest");
		}
		else {
			System.out.println("d is the bigest");
		}

	}

}
