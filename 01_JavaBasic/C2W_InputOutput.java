import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class C2W_InputOutput {
    public static void ioWithISR() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Enter a character: ");
        // System.out.println(isr.read());                                      // Possible

        // char c = isr.read();                         // error: incompatible types: possible lossy conversion from int to char

        // int i = (char)isr.read();                    // works!

        char ch = (char)isr.read();                     // works!
        System.out.println(ch);

        // isr.close();                                    // Stream closed

        System.out.println("Enter a character: ");
        ch = (char)isr.read();                          // As \n is in System.in pipeline so it's not get stop for our input
        System.out.println(ch);                         
        System.out.println("Enter a character:");
        ch = (char)isr.read();                         // Here exception came As --> Exception in thread "main" java.io.IOException: Stream closed and then stackTrace
        System.out.println(ch);
    }

    public static void ioWithBR() throws IOException{
        // ---> Both lines are same just container making is difference
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something:");

        String b = br.readLine();
        System.out.println(b);

        // --> BufferedReader read() method works same as isr's read()

        int i = Integer.parseInt(br.readLine());                                    // If you entered invalid input --> Exception in thread "main" java.lang.NumberFormatException: For input string: "e"
        System.out.println(i);

        Scanner sc = new Scanner(System.in);                     // Check Internal

    }

    public static void ioBRtrialerror() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter something:");
        // String s1 = br.readLine();
        // System.out.println("Enter something:");
        // char ch = (char)br.read();
        // System.out.println("Enter something:");
        // String s2 = br.readLine();
        // System.out.println("Enter something:");
        // String s3 = br.readLine();


        System.out.println("Enter name:");
        String s1 = br.readLine();
        System.out.println("The value is: " + s1);
        System.out.println("Enter building wing:");
        char ch = (char)br.read();
        System.out.println("The value is: " + ch);
        // Solution for this exception --> skip() method
        br.skip(1);                                     // --> Why won't 1 as a argument works here?
        System.out.println("Enter flat no:");
        // int i = Integer.parseInt(br.readLine());        // --> Exception in thread "main" java.lang.NumberFormatException: For input string: ""
        ch = (char)br.read();
        System.out.println("The value is: " + ch);
                
    }

    public static void ioBRStreamClosed() throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name:");
        String s1 = br1.readLine();
        System.out.println("The value is: " + s1);

        br1.close();
        // Exception in thread "main" java.io.IOException: Stream closed
        System.out.println("Enter name:");
        String s2 = br2.readLine();
        System.out.println("The value is: " + s2);

        // Observe carefully anyone br stream is closed its affects everyone

    }
    public static void main(String[] args) throws IOException{
        // System.out.println("test"); 
        // ioBRStreamClosed();
        
    }
}