import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(1)

public class SelectionSort {
  
    public static void selectionSort(int arr[]){
      int n = arr.length-1;
      for(int i=0;i<n;i++){
        int minIndex = i;
        //finding min index from i+1 to n
        for(int j=i+1;j<=n;j++){
          if(arr[j]<arr[minIndex]){
            minIndex = j;
          }
        }
        //swap arr[i] and arr[min]
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
    
    public static void main(String[] args) {
      int arr[] = {2, 3, 4, 1, 5};
      //before sorting
      System.out.println(Arrays.toString(arr));
      //calling sorting method
      selectionSort(arr);
      //after sorting
      System.out.println(Arrays.toString(arr));
  }
}
