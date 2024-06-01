# Selection Sort Algorithm

## Introduction
Selection Sort is a straightforward and intuitive sorting algorithm. It works by repeatedly finding the minimum element from the unsorted part of an array and moving it to the beginning. This process is repeated until the entire array is sorted.

## How it Works
The algorithm divides the input array into two parts: the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire array.

The steps are as follows:
1. Find the smallest element in the unsorted part of the array.
2. Swap it with the leftmost unsorted element.
3. Move the boundary of the unsorted part one step to the right.

This process continues iteratively until the unsorted part becomes empty and the array is sorted.

## Visual Example:

| Initial list      | [29, 10, 14, 37, 13]                         | swap|
| ----------------- | ---------------------------------------------|-----|
|  1st pass | Find minimum in [29, 10, 14, 37, 13] : 10| Swap 10 with 29 | 
|  2nd pass | Find minimum in [29, 14, 37, 13]: 13 | Swap 13 with 29 |
|  3rd pass | Find minimum in [14, 37, 29]: 14 | 14 is already in place, no swap |
|  4th pass | Find minimum in [37, 29]: 2| Swap 29 with 37|
 
 Final List: [10, 13, 14, 29, 37]

## Complexity
- **Time Complexity**: O(n^2), where n is the number of elements in the array.
- **Space Complexity**: O(1), as it only requires a constant amount of additional memory space.

## Advantages
- Simple and easy to implement.
- No additional memory is used (in-place sorting).
- Can be useful when memory write is a costly operation.

## Disadvantages
- Not suitable for large lists.
- Less efficient compared to other sorting algorithms like quicksort, mergesort, or heapsort.

## Conclusion
Selection Sort is an easy-to-understand algorithm perfect for educational purposes and small datasets. However, for more efficient sorting of large datasets, other algorithms are preferred.

