import java.io.*;

class CompileEx {

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br.readLine();                // Shows this exception that means it's compile-time
        // Error: unreported exception IOException; must be caught or declared to be thrown

        System.out.println(name);

        // br.close();          // Exception in thread "main" java.io.IOException: Stream closed and [StackTrace]

        System.out.println("Enter your DOB: ");
        int dob = Integer.parseInt(br.readLine());
    
        System.out.println(dob);

        // Can HANDLED like this -->
        // try {
        //     int dob = Integer.parseInt(br.readLine());
        //     System.out.println(dob);
        // } catch(NumberFormatException nfe) {
        //     // nfe.printStackTrace();
        // }
    }

    public static void main(String[] arg) throws IOException {
        new CompileEx().getData();
    }
}






/* OUTPUT:
 * Enter your name:                                             
    ram
    ram
    Enter your DOB:
    shyam
    Exception in thread "main" java.lang.NumberFormatException: For input string: "shyam"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at CompileEx.main(prog4.java:13)
 */


//  java.lang.NumberFormatException extends java.lang.IllegalArgumentException and it extends java.lang.RuntimeException
