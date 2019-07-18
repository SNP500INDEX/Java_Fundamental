package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		// int array declaration
		int[] a = new int[4];
		
		//assign array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//print array
		int sum = 0;
		for(int i=0; i<a.length ; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
		}
		
		System.out.printf("The sum of the array is "+"\"" +"%d"+ "\"" + ".%n",  sum);
		
		int[] b = {1000,2000,3000,4000};
		
		//Changing the value of the array (assign)
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		
		//print the array
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		//print the array - for loop
		
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
