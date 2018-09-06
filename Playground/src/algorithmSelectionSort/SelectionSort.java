package algorithmSelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = {9,8,3,13,87,12,99};
	
		selectionSort(array);
		
		for(int i=0; i < array.length; i++) {
			System.out.print("[" + i + "]" + array[i] + ", "); //print array
			
		}
	}

	//Selection Sort, find min throughout array, then swap spots
	public static int[] selectionSort(int [] array) {
		int minIndex;
		
		for(int i = 0; i < array.length; i++) {			//first loop to iterate through array
			minIndex = i; 										//set min to the next index
			for (int j = i+1; j < array.length; j++) {		//second loop to compare the value at 'min' to next index's value
				if (array[j] < array[i]) 					//if the other index's value is smaller than current min...
					minIndex = j;								//then set new min index
			}
			
			//swap values at the end of each iteration of first loop
			int tempValue = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tempValue;		
		}
		
		return array;
	}

}
