# SortingAlgorithms
Different sorting algorithms written in java


1) QuickSort: Quicksort is a divide-and-conqueralgorithm  which  means  that  in  order  to  solve  a  problem, it  is  divided  into  smaller  problems.  Quicksort  starts  by choosing a ‘pivot’  element  which  is  then  used  to  compare every  other  element in  the list  to.  The  elements  that  are smaller  than  the ‘pivot’ move to the  left  of  the  ‘pivot’ and  the  elements  larger  than  the  ‘pivot’ move to the right of  it.  The  ‘pivot’  essentially  partitions  the  array into two subarrays. Quicksort has a worst time complexity of O(n2) and an average time complexity of O(n·log(n)).



2) MergeSort: Merge sort, like quicksort, is a divide-and-conquer algorithm wherein the problem is broken down into smaller  problems.  When  the  smaller  problems  are  simple enough  to  be  solved,  they  are  then  merged  together  into  a final solution to the problem. This method is done recursively until the problem is solved. Merge sort has a time complexity of O(n·log(n)) in  worst,  average  and  best  cases.



3) SelectionSort: In  order  to  sort  a  list  of  data,  the smallest  item  is  selected  from  the  list  and  is  then  swapped with  the  left most  item  on  that  list.  Thus,  the  selected  item becomes  a  part  of  the  sorted  list.  Selection  sort  has  a  time
complexity  of  O(n2)  in  best,  average  and  worst  cases.



4) BubbleSort: Bubble sort goes through a list of data by comparing  two  elements  next  to  each  other.  If  the  element to  the  left  is  larger,  it  swaps  it  to  the  right  which  means that  the  larger  items  tend  to  bubble  to  the  right.  And  the sorted  elements  will  not  be  iterated  over  in  the  next  round of iteration. Bubble sort has a time complexity of O(n2) in the  average  and  worst  cases,  and O(n) in  the  best  case.



5) InsertionSort: Insertion  sort  goes  through  a  list  of data  by  comparing  each  element  to  the  element  on  the left  of  it.  If  the  current  element  is  smaller  than  the  one on  the  left,  then  they  swap  places.  Thus,  each  element will  be  inserted  in  the  correct  position.  Insertion  sort  has a time   complexity   of O(n2) in   the   average   and   worst case,  and O(n) in  the  best  case.  For  a  small  set  of  data, insertion  sort  has  proven  to  be  faster  than  most  efficient sorting  algorithms  such  as  quicksort  and  merge  sort.
