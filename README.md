# Algorithm
Informally, an algorithm is any well-defined computational procedure that takes some value, or set of values, as input and produces some value, or set of values, as output. An algorithm is thus a sequence of computational steps that transform the input into the output.

An algorithm should have three important characteristics to be considered valid:

It should be finite: If your algorithm never ends trying to solve the problem it was designed to solve then it is useless
It should have well defined instructions: Each step of the algorithm has to be precisely defined; the instructions should be unambiguously specified for each case.
It should be effective: The algorithm should solve the problem it was designed to solve. And it should be possible to demonstrate that the algorithm converges with just a paper and pencil.



# Cycle Sort

# Heap Sort

# HeapSortMinHeap

# Insertion Sort
  
  
# Merge Sort NonRecursive
  Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
  
  The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. See the following C implementation for details.

MergeSort(arr[], l,  r)
If r > l
1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
 
 
 
# MinMaxSearch

# Quick Sort

# Selection Sort

# Shell Sort
