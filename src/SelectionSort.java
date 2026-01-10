import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {6,5,8,3,4,1};
        selection(arr, arr.length,0,0 );
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[], int i, int j, int maxIndex){
        if(i == 0){
            return;
        }
        if(j < i){
            //then update the maxIndex with j
            //if the arr[j] > arr[maxInd] and increment j
            if(arr[j] > arr[maxIndex]){
                selection(arr,i,j+1,j);
            }
            //element at maxIndex is greater than j
            //simply move to next Index
            else{
                selection(arr,i,j+1,maxIndex);
            }
        }
        //else block gets executed when the j becomes >= i
        //in that case place the element at maxIndex at the n-1 th position
        else{
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i-1];
            arr[i-1] = temp;

            //after swapping now the n-1 th element is at correct position
            // so decrement the value of i
            //initialize the maxIndex to 0 and j to 0
            selection(arr,i-1,0,0);
        }
    }
}
