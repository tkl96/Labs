import java.util.*;

public class lab10 {

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static void swap(int[] arr, int index1, int index2) {
	if (index1 == index2) {
	    // Do nothing!
	} else {
	    int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
	}
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static int selectionSort(int[] arr) {
	
		if (arr.length < 2) {
		    return 0;
		}
		
		int index=0;
		int minIndex = 0;
		int minVal = 0;

		for (int j = 0; j < (arr.length-1); j++) {
		    minIndex = j;
		    minVal = arr[j];
		    for(int k = j + 1; k < arr.length; k++) {
				if (arr[k] < minVal) {
				    minVal = arr[k];
				    minIndex = k;
				}
		    }
		    if (minIndex!=j) {
		    	index++;
		    	swap(arr, j, minIndex);
		    	//printArray(arr);
          		//System.out.println(index);
        }

		}
		return index;
    }

    public static int bubbleSort(int[] arr) {  
    	int index=0;
        for (int i = 0; i < arr.length - 1; i++) {  
            for (int j = 0; j < arr.length - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {
                	swap(arr,j,j+1);
                	index++;
                }   
            }  
        }  
  		return index;
    }

	public static int[][] deepCopy(int[][] arr){
		if (arr == null) {
        	return null;
    	}
		int[][] ar=new int[arr.length][];
		for(int i =0 ; i < arr.length; i++){
			ar[i] = Arrays.copyOf(arr[i], arr[i].length);
 		}
 		return ar;
	}

    public static void main(String[] args) {
		int[][] a1 = { {8, 9, 5, 6, 4, 3},
			       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
			       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
			       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
			       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
	
		int [][] a2=deepCopy(a1);
		 for(int i =0 ; i < a2.length; i++){
		 	System.out.print("Bubble sort: ");
		 	int swap=bubbleSort(a1[i]);
		 	printArray(a1[i]);
		 	System.out.println("Swaps= "+swap);
		 	System.out.print("Selection sort: ");
		 	swap=selectionSort(a2[i]);
		 	printArray(a2[i]);
		 	System.out.println("Swaps= "+swap);
		 	//System.exit(0);
 	// 		for(int j=0; j<a2[i].length;j++){
 	// 			System.out.print(a2[i][j]);}
 	// 		System.out.println();
 	 	}   
    }

    
}