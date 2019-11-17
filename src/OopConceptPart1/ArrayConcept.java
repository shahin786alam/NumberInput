package OopConceptPart1;

public class ArrayConcept {

	public static void main(String[] args) {
		//one dim array
		//dis advantage of one dim array
		//size is fixed===To overcome of this problem, we use collection, ArrayList, HashTable, use dynamic array
		//stores only similar data type===To overcome of this problem, We use object array
		//array: to store similar data type values in a array variable
		//lowest bound/index=0
		//upper bound/index=n-1 (n is size of array)
		int []i= new int[4];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		System.out.println(i[1]);
		System.out.println(i[2]);
		//System.out.println(i[3]);
		
		System.out.println(i.length);//Array size
		
		//print all the value
		for( int j=0; j<i.length; j++) {
			System.out.println(i[j]);	
		}
		
		int sum=i[0]+i[1]+i[2];
		System.out.println(sum);
		
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(	b[1]);
		// Home Work: double, float, char,String---
		//Object array: (Object is a class)---use to store different datatype values
		Object ob[]=new Object[6];
		ob[0]=true;
		ob[1]=122;
		ob[2]=b;
		ob[3]=12.12;
		ob[4]="my name is alam";
		ob[5]="Upper Darby";
		//ob[6]="Upper Darby"; //you can write like this you will get Exceptions:(ArrayIndexOutOfBoundsException)
		//ob[7]="Upper Darby";
		//System.out.println(ob[7]);//ArrayIndexOutOfBoundsException
			
	}

}
