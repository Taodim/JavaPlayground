package algorithmRecursion;

public class Recursion {

	public static void main(String[] args) {
		int number = 10;
		reduceByOne(number);
		
		//Creating array
		int[] array = new int[14];
				
		//Assigning numbers into array
		//Random rand = new Random(); IGNORE this, array must be sorted
		for(int i=0; i < array.length; i++) {
			array[i] = i+4;
			System.out.print("[" + i + "]" + array[i] + ", "); //print array
		}
		
		System.out.println(recursiveLinearSearch(array, 0, 15));
		System.out.println(recursiveBinarySearch(array, 0, array.length-1, 50));
		
	}
	
	
	
	
	
	
	//-----------------------------------------------------------------------------------------------------------
	//Reduce the number by one recursively 
	public static void reduceByOne (int n) {
		if (n >= 0) {
			System.out.println(n); //print number before recurse again
			reduceByOne(n-1);			
		}	
	}
	
	//Linear search an array for location of provided value recursively 
	public static int recursiveLinearSearch(int [] array, int index, int value ) {
		if(index > array.length) { //if index is larger than array length, then value is not found
			return -1;
		}
		else if(array[index] == value) { //return index if value found
			return index;
		}
		else return recursiveLinearSearch(array, index+1, value); //recurse through method to find value	
	}
	
	//Binary Search an array for location of provided value recursively
	public static int recursiveBinarySearch(int [] array, int start, int end, int value) {
		if (start > end) { //return -1 when start and ends lapse each other
			return -1;
		}
		
		int index = (start + end)/2; //set middle index 
		
		if (array[index] == value)//found value
			return index;		
		
		else if(array[index] > value) { //index value is larger than value, then move end to index-1
			return recursiveBinarySearch(array, start, index-1, value);
		}
		else { //if index value is smaller than value, then move start to index+1
			return recursiveBinarySearch(array, index+1, end, value);
		}
	}
	
}
