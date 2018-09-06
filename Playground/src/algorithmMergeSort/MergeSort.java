package algorithmMergeSort;

public class MergeSort {

	public static void main(String[] args) {
		int [] array = {9,8,3,13,87,12,99};
		
		MergeSort(array, 0, array.length-1);
		
		for(int i=0; i < array.length; i++) {
			System.out.print("[" + i + "]" + array[i] + ", "); //print array

		}

	}
	
	//This method splits array into halves, then run MergeSort on each, then merge them sorted halves back together. 
	public static int[] MergeSort(int [] array, int start, int end) {
		if(end <= start) return array;						//if on BASE case (only 1 index array), stop splitting and return array. 
		
		int mid = (start+end)/2;							//set mid point
		
		MergeSort(array, start, mid);						//Run MergeSort again on left half
		MergeSort(array, mid+1, end);						// '' on right half
		
		merge(array, start, mid, end);						//Merge the two sorted halves. 
		
		return array;
	}
	
	public static void merge(int[] array, int start, int mid, int end) {
		//Create a temp array to sort values into
		int [] temp = new int[(end-start)+1];
		
		//Create two index pointer for input array, left points to beginning, and right points to mid+1
		int left = start;
		int right = mid+1;
		int k = 0;  //index on temp array
		
		//iterate through input array's range, then insert smaller value into appropriate temp array index. 
		while(left <= mid && right <=end) {
			if(array[left] < array[right]) {
				temp[k] = array[left];
				left++;
				k++;
			} else {
				temp[k] = array[right];
				right++;
				k++;
			}
		}
		
		//If left point is less than mid index, that means right side is out of index, and leftover values in left is sorted. Copy into remaining slots of temp
		if(left <= mid) {
			while(left <= mid) {
				temp[k] = array[left];
				left++;
				k++;			
			}
		}
		
		//same as above for right side
		if(right <= end) {
			while(right <= end) {
				temp[k] = array[right];
				right++;
				k++;
			}
		}
		
		//Copy temp over to appropriate range on input array
		for(int i = 0; i< temp.length; i++) {
			array[start+i] = temp[i];
		}
				
		//return array;
	}
	
}