package OopConceptPart1;

import java.util.ArrayList;

public class TwoDArray {

	public static void main(String[] args) {
		//2D array is a collection of data cells, all of the same type, 
		//which can be given a single name. However, a 2D array is organized as a matrix 
		//with a number of rows and columns.
		// 2D arrays specifies both the number of rows and the number of columns.
		int i[][]=new int [2][4];
		System.out.println(i.length);//for rows =2
		System.out.println(i[0].length);//for colms =4
		System.out.println("======================");
		i[0][0]=1;
		i[0][1]=2;
		i[0][2]=3;
		i[0][3]=4;
		//i[0][4]=60; //ArrayIndexOutOfBoundsException
		System.out.println(i[0][0]); //print 1

		i[1][0]=5;
		i[1][1]=6;
		i[1][2]=7;
		i[1][3]=8;
		System.out.println(i[1][3]);//print 8
		System.out.println("==================");

		//print all the values of 2dim array: use for loop
		//row=0,col=0 to 4
		//row=1,col=0 to 4
		//row=2,col=0 to 4
		for(int row=0; row<i.length; row++) {
			for(int col=0; col<i[0].length; col++) {
				System.out.println(i[row][col]);
			}
		}
		System.out.println("===================");
		Object obj[][]=new Object [2][5];
		obj[0][0]=1;
		obj[0][1]=2.12;
		obj[0][2]="alam";
		obj[0][3]=true;
		obj[0][4]="20/12/90";
		System.out.println(obj[0][4]);
		
		obj[1][0]="b";
		obj[1][1]=2.12;
		obj[1][2]="Upper Darby";
		obj[1][3]=false;
		obj[1][4]="20/12/90";
		System.out.println(obj[1][2]);
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		System.out.println(a.get(0));
		ArrayList<String> s= new ArrayList<String>();
		s.add("hello");
		System.out.println(s.size());
		ArrayList s1= new ArrayList();
		s1.add(12);
		s1.add("hello");
		s1.add(12.12);
		s1.add(true);
		System.out.println(s1.get(2));
		System.out.println("===================");
		for(int j=0; j<s1.size(); j++) {
			System.out.println(s1.get(j));
		}
  }
}
