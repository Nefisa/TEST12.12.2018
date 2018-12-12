package Zadatak2;

public class MyArray {

	private int[] array;

	public MyArray() {

	}

	public MyArray(int[] array) {
		this.array = array;
	}

	public int getSmallestElement() {

		int min = array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] < min)
				min = this.array[i];
		}

		return min;
	}

	public int getLargestElement() {

		int max = array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] > max)
				max = this.array[i];
		}

		return max;
	}

	public int sumAllElements() {

		int sum = 0;
		for (int i = 0; i < this.array.length; i++)
			sum += this.array[i];

		return sum;
	}
	
	public void printAllElements() {
		
		System.out.println("Elements of array: ");
		for(int i = 0; i < this.array.length; i++){
			System.out.print(this.array[i] + " ");
		}
	}

}
