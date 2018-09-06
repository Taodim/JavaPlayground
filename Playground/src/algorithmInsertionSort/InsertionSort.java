package algorithmInsertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		int [] array = {9,8,3,13,87,12,99};
		
		insertionSort(array);
		
		for(int i=0; i < array.length; i++) {
			System.out.print("[" + i + "]" + array[i] + ", "); //print array
			
		}

	}

	public static int[] insertionSort(int [] array) {
		int element;
		
		for(int i = 1; i<array.length; i++) {
			element = array[i];
			int j = i-1;
			while(j>= 0 && array[j] > element) {
				array[j+1] = array[j];
				j--;
			}			
			array[j+1] = element;
		}
		
	return array;

	}
}