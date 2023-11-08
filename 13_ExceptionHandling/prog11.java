// USER-DEFINED EXCEPTION THROWN

import java.util.Scanner;

class DataOverFlowException extends RuntimeException {
    
    DataOverFlowException(String msg) {
        super(msg);
    }
}
class DataUnderFlowException extends RuntimeException {
    DataUnderFlowException(String msg) {
        super(msg);
    }
    
}
class Demo {
    // public static void main(String[] args) throws DataOverFlowException, DataUnderFlowException {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("[Note: Data should be in range of 0 to 100]");

        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter data:");
            int data = 0;
            try {
                data = sc.nextInt();
                if (data<0)
                    throw new DataUnderFlowException("Mitra data 0 peksha lahan aahe");

                if(data>100)
                    throw new DataOverFlowException("Mitra data 100 peksha motha aahe");
            
            } catch (DataUnderFlowException ex) {
                System.out.println(ex.toString());
                System.out.println("Enter data again:");
                data = sc.nextInt();

            } catch (DataOverFlowException ex) {
                System.out.println(ex.toString());
                System.out.println("Enter data again:");
                data = sc.nextInt();
            }
            
            arr[i] = data;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}