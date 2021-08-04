# Algorithm

Informally, an algorithm is any well-defined computational procedure that takes some value, or set of values, as input and produces some value, or set of values, as output. An algorithm is thus a sequence of computational steps that transform the input into the output.

An algorithm should have three important characteristics to be considered valid:

It should be finite: If your algorithm never ends trying to solve the problem it was designed to solve then it is useless
It should have well defined instructions: Each step of the algorithm has to be precisely defined; the instructions should be unambiguously specified for each case.
It should be effective: The algorithm should solve the problem it was designed to solve. And it should be possible to demonstrate that the algorithm converges with just a paper and pencil.




# Cycle Sort

Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm, a comparison sort that is theoretically optimal in terms of the total number of writes to the original array. 

1.It is optimal in terms of number of memory writes. It minimizes the number of memory writes to sort (Each value is either written zero times, if it’s already in its correct position, or written one time to its correct position.)

2.It is based on the idea that array to be sorted can be divided into cycles. Cycles can be visualized as a graph. We have n nodes and an edge directed from node i to node j if the element at i-th index must be present at j-th index in the sorted array. 




# Heap Sort

Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the beginning. We repeat the same process for the remaining elements.

Heap Sort Algorithm for sorting in increasing order: 

1. Build a max heap from the input data. 

2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of the tree. 

3. Repeat step 2 while the size of the heap is greater than 1.

How to build the heap? 

Heapify procedure can be applied to a node only if its children nodes are heapified. So the heapification must be performed in the bottom-up order.




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




# Bubble Sort

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

Example:

First Pass: 

( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 

( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 

( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass: 

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 

( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 

( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 

Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass: 

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 




# Counting Sort

Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the output sequence.

Let us understand it with the help of an example. 

For simplicity, consider the data in the range 0 to 9. 

Input data: 1, 4, 1, 2, 7, 5, 2

  1) Take a count array to store the count of each unique object.
 
  Index:     0  1  2  3  4  5  6  7  8  9
  
  Count:     0  2  2  0   1  1  0  1  0  0

  2) Modify the count array such that each element at each index stores the sum of previous counts. 

  Index:     0  1  2  3  4  5  6  7  8  9
  
  Count:     0  2  4  4  5  6  6  7  7  7

The modified count array indicates the position of each object in the output sequence.
 
  3) Output each object from the input sequence followed by decreasing its count by 1.

  Process the input data: 1, 4, 1, 2, 7, 5, 2. Position of 1 is 2.
  
  Put data 1 at index 2 in output. Decrease count by 1 to place next data 1 at an index 1 smaller than this index.
