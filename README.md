# SortingAlgorithms
Different sorting algorithms written in java


1) QuickSort: Quicksort is a divide-and-conqueralgorithm  which  means  that  in  order  to  solve  a  problem,it  is  divided  into  smaller  problems.  Quicksort  starts  bychoosing a ‘pivot’  element  which  is  then  used  to  compareevery  other  element in  the list  to.  The  elements  that  aresmaller  than  the  ‘pivot’ move to the  left  of  the  ‘pivot’and  the  elements  larger  than  the  ‘pivot’ move to the rightof  it.  The  ‘pivot’  essentially  partitions  the  array into twosubarrays. Quicksort has a worst time complexity of O(n2)and an average time complexity ofO(n·log(n)).



2) MergeSort: Merge sort, like quicksort, is a divide-and-conquer algorithm wherein the problem is broken down intosmaller  problems.  When  the  smaller  problems  are  simpleenough  to  be  solved,  they  are  then  merged  together  into  afinal solution to the problem. This method is done recursivelyuntil the problem is solved. Merge sort has a time complexityofO(n·log(n))in  worst,  average  and  best  cases.



3) SelectionSort: In  order  to  sort  a  list  of  data,  thesmallest  item  is  selected  from  the  list  and  is  then  swappedwith  the  leftmost  item  on  that  list.  Thus,  the  selected  itembecomes  a  part  of  the  sorted  list.  Selection  sort  has  a  time
complexity  of  O(n2)  in  best,  average  and  worst  cases.



4) BubbleSort: Bubble sort goes through a list of data bycomparing  two  elements  next  to  each  other.  If  the  elementto  the  left  is  larger,  it  swaps  it  to  the  right  which  meansthat  the  larger  items  tend  to  bubble  to  the  right.  And  thesorted  elements  will  not  be  iterated  over  in  the  next  roundof iteration. Bubble sort has a time complexity ofO(n2)inthe  average  and  worst  cases  andO(n)in  the  best  case.



5) InsertionSort: Insertion  sort  goes  through  a  list  ofdata  by  comparing  each  element  to  the  element  on  theleft  of  it.  If  the  current  element  is  smaller  than  the  oneon  the  left,  then  they  swap  places.  Thus,  each  elementwill  be  inserted  in  the  correct  position.  Insertion  sort  hasa   time   complexity   ofO(n2)in   the   average   and   worstcase  andO(n)in  the  best  case.  For  a  small  set  of  data,insertion  sort  has  proven  to  be  faster  than  more  efficientsorting  algorithms  such  as  quicksort  or  merge  sort.
