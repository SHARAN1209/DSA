# Insertion Sort Algorithm

## Introduction
Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it provides several advantages:
- Simple implementation
- Efficient for small data sets
- Adaptive: efficient for data sets that are already substantially sorted
- Stable: does not change the relative order of elements with equal keys
- In-place: only requires a constant amount O(1) of additional memory space

## How It Works
The algorithm iterates over an array, growing a sorted list behind the current location. It takes each element from the input and finds the location it belongs within the sorted list, then inserts it there. It repeats until no input elements remain.

Here is the step-by-step process:
1. Start from the second element of the array (the first element is considered sorted).
2. Compare the current element with the largest value in the sorted array.
3. If the current element is larger, leave the element in its place and move to the next element.
4. If the current element is smaller, compare it with all the elements in the sorted array and insert it into the correct position.
5. Repeat until the array is sorted.

## Visual Example:

| Initial list      | [12, 31, 25, 8, 32, 17]                | key| |
| ----------------- | ---------------------------------------------|-----|-|
|  1st pass | Compare 31 with 12. Since 31 is greater than 12, no shifting is needed| 31 |[12, 31, 25, 8, 32, 17] 
|  2nd pass | Compare 25 with 31. Since 25 is less than 31, shift 31 to the right.Compare 25 with 12. | 25 |[12, 25, 31, 8, 32, 17] |
|  | Since 25 is greater than 12, place 25 in the position after 12. |  |[12, 25, 31, 8, 32, 17]|
|  3rd pass | Compare 8 with 31. Since 8 is less than 31, shift 31 to the right.| 8 | [12, 25, 8, 31, 32, 17]|
|   |Compare 8 with 25. Since 8 is less than 25, shift 25 to the right.|  |[12, 8, 25, 31, 32, 17] |
|   | Compare 8 with 12. Since 8 is less than 12, shift 12 to the right.|  |[8, 12, 25, 31, 32, 17]  |
|  4th pass | Compare 32 with 31. Since 32 is greater than 31, no shifting is needed.| 32|[8, 12, 25, 31, 32, 17]
|  5th pass | Compare 17 with 32. Since 17 is less than 32, shift 32 to the right.| 17|[8, 12, 25, 31, 17, 32]
|   | Compare 17 with 31. Since 17 is less than 31, shift 31 to the right| |[8, 12, 25, 17, 31, 32]
 |   | Compare 17 with 25. Since 17 is less than 25, shift 25 to the right.| |[8, 12, 17, 25, 31, 32]
  |   | Compare 17 with 12. Since 17 is greater than 12, place 17 after 12.| |[8, 12, 17, 25, 31, 32]

Final List:[8, 12, 17, 25, 31, 32]


## Complexity
- **Time Complexity**:
  - Best: O(n) when the array is already sorted.
  - Average: O(n^2)
  - Worst: O(n^2)
- **Space Complexity**: O(1)

