package numberinput;

public class BasicDemo {
	String name="shahin alam";
	static int age=27;

	public static void main(String[] args) {
		//1.diractly call:
		sum();
		System.out.println(age);

		//2.call by class name:
		System.out.println(BasicDemo.age);
		BasicDemo.sum();

		//3.create object:
		BasicDemo b= new BasicDemo();
		b.maill();
		System.out.println(b.name);

		int a=20; //local var:
		b.main();
		//main();
		main(a);
		main(30,40);

	}
	//non static
	public static void main() {
		System.out.println("0 input parameter");
	}
	public static void main(int a) {
		System.out.println("1 input parameter");
	}
	public static void main(int a,int d) {
		System.out.println("2 input parameter");
	}
	public static void main(String a,int d,int c) {
		System.out.println("3 input parameter");
	}

	//non static
	public void maill() { 
		System.out.println("This is maill method");	
	}

	//static method
	public static void sum() { 
		System.out.println("sum method");
	}

	public void pa() {

	}

	public void pa(boolean b) {

	}
	public void pa(String c) {

	}
	public void pa(boolean b,int a) {

	}


}
