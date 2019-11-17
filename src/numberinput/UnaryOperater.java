package numberinput;

public class UnaryOperater {

	public static void main(String[] args) {
		
		int a=-20;
		int i;
		
		i=+a;
		System.out.println(i);
		
		i=-a;
		System.out.println(i);
		
		int x=10;
		int y;
		y=x++; //postfix increment (return y=10
		System.out.println(y);
		
		y=x;      //return y=11
		System.out.println(y);
		
		y=++x; //prefix increment  (return y=12
		System.out.println(y);
		
		y=x;  //return y=12
		System.out.println(y);
		
		y=x--; //postfix decrement (return y=12
		System.out.println(y);
		
		y=x;  //return y=11
		System.out.println(y);
		
		y=--x; //prefix decrement  (returny=10
		System.out.println(y);
		
		y=x;  //return y= 10
		System.out.println(y);

	}

}
