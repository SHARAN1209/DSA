import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(1)

public class InsertionSort {
  
    public static void insertionSort(int arr[]){
      int n = arr.length;
      for(int i=1;i<n;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
      }
    }
    
    public static void main(String[] args) {
      int arr[] = {12, 31, 25, 8, 32, 17};
      //before sorting
      System.out.println(Arrays.toString(arr));
      //calling sorting method
      insertionSort(arr);
      //after sorting
      System.out.println(Arrays.toString(arr));
  }
}
