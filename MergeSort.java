public class MergeSort {
  public static void main(String[] args) {
     int[] arr = {3,1,5,6,2,4};
     sort(arr, 0, arr.length-1);
     for(int i : arr){
       System.out.println(i);
     }
  }

  static void sort(int[] arr, int l, int r){
    if (l < r) {
      int m = (l+r) / 2;
      sort(arr, l, m);
      sort(arr, m+1, r);
      merge(arr, l, m, r);
  }
  }
  static void merge(int[] arr, int l, int m, int r){
    //find size of the 2 arrays
    int x = m-l+1;
    int y = r-m;

    // create temp arrays
    int L[] = new int[x];
    int R[] = new int[y];

    //copy data to temp arrays
    for(int i=0; i< x; ++i){
      L[i] = arr[l+i];
    }

    for(int j=0; j< y; ++j){
      R[j] = arr[m+1+j];
    }

    // merge temp arrays
    int i =0, j=0;
    // intital index of merged subarray of the array
    int k=l;

    while(i < x && j < y){
      if(L[i] <= R[j]){
        arr[k] = L[i];
        i++;
      }else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
      //copy remaining data
      while(i < x){
        arr[k] = L[i];
        i++;
        k++;
      }

      while(j < y){
        arr[k] = R[j];
        j++;
        k++;
      }
  }

}
