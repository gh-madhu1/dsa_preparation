/*
* Merge two arrays
*
*/

public class MergeTwoArrays {
	
	public static void main(String... args){
		
		int arr1[] = {2,5,7,11,13};
		int arr2[] = {3,6,9,12,15,21,18};
		
		int[] result = mergeArrays(arr1, arr2);
		
		for (int i: result){
			System.out.print(i);
			System.out.print(" ");
		}
		
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2){
		
		int size = arr1.length + arr2.length;
		
		int[] mergeArray = new int[size];
		
		for(int i=0; i < arr1.length ; i++){
			mergeArray[i] = arr1[i];
		}
		
		for (int j= arr1.length, k =0; j < size && k < arr2.length; j++, k++ ){
			mergeArray[j] = arr2[k];
		}
		
		return mergeArray;
	}
}