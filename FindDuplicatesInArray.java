public class FindDuplicatesInArray{

    public static void main(String... args){
        int []arr = {3,5,4,2,4,6,2,3,5,1};
        findDuplicates( arr);
    }
    
    public static void findDuplicates(int[] arr){
        
        int[] newArr = new int[arr.length];
        int counter = 0;
        
		for(int i : arr){
			
			if(!isExist(newArr, i)){
				newArr[counter] = i;
				counter ++;
			}
		}
        for(int j : newArr){
			System.out.println(j);
			if (counter == 1){
				break;
			}else counter--;
		}
		
    }
	
	public static boolean isExist(int[] arr, int element){
		
		for(int i : arr){
			
			if(i == element){
				return true;
			}
		}
		
		return false;
	}
}