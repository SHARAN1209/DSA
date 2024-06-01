# Bubble Sort Algorithm

## Introduction
Bubble Sort is one of the simplest sorting algorithms that works by repeatedly swapping the adjacent elements if they are in the wrong order. The name "Bubble Sort" comes from the way smaller elements "bubble" to the top of the list.

## How it Works
Given an array `arr`, with a length of `n`, the algorithm compares each pair of adjacent items and swaps them if they are in the wrong order. This process is repeated until no swaps are needed, which indicates that the array is sorted.

The steps are:
1. Compare `arr[0]` with `arr[1]`. If `arr[0] > arr[1]`, swap them.
2. Move to the next pair, compare `arr[1]` and `arr[2]`, and swap if necessary.
3. Continue this process for `arr[n-2]` and `arr[n-1]`.
4. The largest number is now at the end of the array.
5. Repeat the steps for the rest of the array (`n-1` times in total).

## Complexity
- **Time Complexity:**
  - Best Case: O(n) (when the array is already sorted)
  - Average Case: O(n^2)
  - Worst Case: O(n^2)
- **Space Complexity:** O(1) (no additional space is used)


## Visual Example:

| Initial list      | [5, 3, 8, 4, 2]                                                    |
| ----------------- | ------------------------------------------------------------------ |
| After 1st pass | [3, 5, 4, 2, 8] |
| After 2nd pass | [3, 4, 2, 5, 8] |
| After 3rd pass | [3, 2, 4, 5, 8] |
| After 4th pass | [2, 3, 4, 5, 8]|


Final list (after check pass): [2, 3, 4, 5, 8]
