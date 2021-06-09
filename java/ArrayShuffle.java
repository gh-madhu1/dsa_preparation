/*
*Array shuffling
*e.g [2,5,7,3,4,6]
*
*/

public class ArrayShuffle{
	
	private static void shuffleOfArray(int[] arr, int shuffleCount){
		
		int counter = 0;

		while(counter < shuffleCount){
			int temp = arr[counter];
			arr[counter] = arr[arr.length-(counter+1)];
			arr[arr.length - (counter+1)]= temp;
			counter++;
		}
		
	}
	
	public static void shuffleOfArray(int[] arr){
		
		shuffleOfArray(arr, 3);
		
	}
	
	public static void main(String... args){
		
		int[] arr = {2, 5, 7, 3, 4, 6};
		
		shuffleOfArray(arr);
		
		for(int i : arr){
			System.out.println(i);
		}
		
	}
	
}