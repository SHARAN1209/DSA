import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(1)

public class BubbleSort {
  
    public static void bubbleSort(int arr[]){
      int n = arr.length-1;
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
          if(arr[j]>arr[j+1]){
            //swap arr[j] and arr[j+1]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    }
    
    public static void main(String[] args) {
      int arr[] = {2, 3, 4, 1, 5};
      //before sorting
      System.out.println(Arrays.toString(arr));
      //calling sorting method
      bubbleSort(arr);
      //after sorting
      System.out.println(Arrays.toString(arr));
  }
}
