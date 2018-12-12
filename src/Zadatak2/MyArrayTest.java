package Zadatak2;

public class MyArrayTest {
	
	public static void main(String[] args) {
		
		int[] array = { 2, 4, 6 ,2 ,7,8,3,1,6,-6,8,0,3};
		
		MyArray myArray1 = new MyArray(array);
		
		System.out.println("Smallest element of array: " + myArray1.getSmallestElement());
		System.out.println("Largest element of array: " + myArray1.getLargestElement());
		System.out.println("Sum of elements of array: " + myArray1.sumAllElements());
		myArray1.printAllElements();
		
	}

}
