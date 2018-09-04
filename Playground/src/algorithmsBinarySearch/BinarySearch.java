package algorithmsBinarySearch;

import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Creating array
		int[] array = new int[10];
		
		//Assigning numbers into array
		//Random rand = new Random(); IGNORE this, array must be sorted
		for(int i=0; i < array.length; i++) {
			array[i] = i;
			System.out.print("[" + i + "]" + array[i] + ", "); //print array
			
		}
		System.out.println();	
		System.out.println(BINARY_SEARCH(array, 1));

	}

	public static int BINARY_SEARCH(int[] array, int key) {
		int start = 0;
		int end = array.length-1;
		int mid = -1;
		
		//While start and end are not overlapping 
		while(start <= end) {
			//set midpoint in sorted array
			mid = (start+end)/2;
			
			//if midpoint's value = key, return index.
			if(array[mid] == key) {
				return mid;
			}
			//if midpoint's value is > key, set end to index before midpoint. AKA cut in half.
			if (array[mid] > key){
				end = mid-1;
			} else {
				start = mid+1; //else set start to index after midpoint. AKA cut in half also.	
			}
		}
		
		//no key found in array, then return -1
		return -1;
	}
}
