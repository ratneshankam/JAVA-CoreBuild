// Selection sort
class Demo {
    public static void main(String[] args) {
        int arr[] = {9,2,7,3,1,8,4,6};

        for (int i=0; i<arr.length-1; i++) {
            int minInd = i;
            for (int j=i+1; j<arr.length; j++) {
                // if (arr[j] <= arr[i]) {
                //     // swapping not using 3rd variable
                //     arr[i] = arr[i] + arr[j];
                //     arr[j] = arr[i] - arr[j];
                //     arr[i] = arr[i] - arr[j];
                // }
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                    // swapping not using 3rd variable
                }
            }
            // System.out.println(arr[i] +" "+  arr[minInd]+ " ");
            // if (arr[i] == arr[minInd]) {
            //     continue;
            // }
            arr[i] = arr[i] + arr[minInd];
            arr[minInd] = arr[i] - arr[minInd];
            arr[i] = arr[i] - arr[minInd];


            // int temp = arr[i];
            // arr[i] = arr[minInd];
            // arr[minInd] = temp;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}