package numberinput;

public class PrimeNumberConcept {
	public static boolean prime(int num) {
//		if(num<=1) {
//			return false;
//		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getprime(int num) {
		for(int i=2; i<=num; i++) {
			if(prime(i))
				System.out.println(i + " ");
		}
	}
	
	public static void main(String [] args) {
		System.out.println(prime(-1));
		getprime(17);
	}

}
