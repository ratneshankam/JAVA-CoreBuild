import java.util.Arrays;

class prog3 {
    int partition(int []arr, int start, int end) {
        int pivot = arr[end];
        System.out.println("start: " + start + " pivot: " + pivot+ " end: " + end);
        int i = -1;
        for (int j=start; j<end-1; j++) {
            if (arr[j] > pivot) {
                i++;
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
            }
        }
        return pivot;
    }
    void quickSort(int []arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    void mergeSort(int []arr, int start, int end) {
        if (start < end) {
            int mid = start + (end-start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    void merge(int []arr, int start, int mid, int end) {
        int arr1[] = new int[mid-start+1];
        int arr2[] = new int[end-mid];

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = arr[start+i];
        }
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = arr[mid+1+i];
        }
        int i=0, j=0, k=start;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i]< arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];

            }
        }

        while (i<arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            arr[k++] = arr2[j++];
        }

    }

    public static void main(String[] args) {
        prog3 obj = new prog3();
        int []arr = {9,1,8,2,7,3,6,4};
        System.out.println(Arrays.toString(arr));
        // obj.mergeSort(arr, 0, arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }
}