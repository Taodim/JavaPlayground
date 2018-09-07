package algorithmQuickSort;

public class QuickSort {

	public static void main(String[] args) {
		int [] array = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
		
		QuickSort(array, 0, array.length-1);
		
		for(int i=0; i < array.length; i++) {
			System.out.print("[" + i + "]" + array[i] + ", "); //print array
		}
	}

	
	//Takes the return index from partition() to split up input array into left and right 
	public static void QuickSort(int[] array, int start, int end) {
		
		//If start and end don't overlap, keep recursing
		if (start < end) {
			int set = partition(array, start, end);				//find the set index, to split up the input array.
			
			QuickSort(array, start, set-1) ;					//run QuickSort on left half, start to set-1
			QuickSort(array, set+1, end) ;						//run QuickSort on right half, set+1 to end					
		}
	
	}
	
	//Iterates through input array's RANGE. Choose 'end' as pivot index, then move smaller values to left side of it.  
	public static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int j = start;							//Explorer, declared here to be explicit
		int i = start-1;						//Chaser
		
		//Iterate through array from start to end
		for(j = start; j < end; j++) {
			if(array[j] <= pivot) {				//choosing 'end' to be pivot index. If value-at-j < value-at-end
				i++;							//increment Chaser
				
				//SWAP value-at-i and value-at-j 
				int temp = array[j];			
				array[j] = array[i];			 
				array[i] = temp;
			}
		}
		
		//This is when j is at end-1 after the for loop
		//SWAP value at END (pivot) and value-at-i+1				
		array[end] = array[i+1];			 
		array[i+1] = pivot;
		
		return i+1;								//return i+1 as the set index. 			
	}
}
