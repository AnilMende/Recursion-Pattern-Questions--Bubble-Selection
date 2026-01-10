1. Triangle => take number of rows r = n and c = 0; until c becomes greater than or equal to r print a star(*),
2. if c > r come to new line and decrement the value of r and c wll be initialized to 0, if r becomes 0 then return nothing this is the base condition.
3. => triangle(r,c) Here r = n and c = 0
4. 
5. Bubble Sort : Same as Triangle but check if the arr[c] > arr[c+1] if it is true then swap the elements at the indices c and c+1, by this when c becomes greater than r
6. max value is placed at the last index of the array, so for the next iteration r should be decremented and c should be reinitialized to 0.
7. => bubble(arr,arr.length-1,0);
8. 
9. Selection Sort : Here we need to find maxIndex that is the maxValues index, after finding the index place it at the n-1 th position of the array,
10. then decremt the value of r, reinitialize the value of c to 0 and maxInd to 0;
11. => bubble(arr,arr.length,0,0)
