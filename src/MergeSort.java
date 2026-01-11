import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {8,3,4,12,5,6};
        //arr = mergeSort(arr);
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int arr[]){
        //base condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int first[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int second[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first, second);
    }

    private static int[] merge(int first[], int second[]){

        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //if the arrays are of not same lengths then we have to add the remaining elements
        //directly into the result array
        while(i <first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    //method 2
    //making changes in the original array
    static void mergeSortInPlace(int arr[], int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int arr[], int s, int m, int e){
        int mix[] = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining elememts
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0;l < mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
