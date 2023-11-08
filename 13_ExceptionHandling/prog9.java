import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        try {
            if (x==0)
                throw new ArithmeticException("Divide by zero exception :D");

            System.out.println(10/x);

        } catch (ArithmeticException ae) {
            // System.out.println("Exception in thread '" + Thread.currentThread().getName() + "' " +  ae);
            // ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println(ae.toString());

        }
    }
}

/*
 * Look at into ByteCode
 * Exception table:
       from    to  target type
          16    40    43   Class java/lang/ArithmeticException
 */