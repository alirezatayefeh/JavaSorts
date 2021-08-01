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

Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

Algorithm:
To sort an array of size n in ascending order:

1. Iterate from arr[1] to arr[n] over the array.
2. Compare the current element (key) to its predecessor.
3. If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

  
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

Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways. 

1.Always pick first element as pivot.

2.Always pick last element as pivot (implemented below)

3.Pick a random element as pivot.

4.Pick median as pivot.

The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.

# Selection Sort

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1. The subarray which is already sorted. 
2. 
3. Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 

# Shell Sort

ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead. When an element has to be moved far ahead, many movements are involved. The idea of shellSort is to allow exchange of far items. In shellSort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of every h’th element is sorted.


