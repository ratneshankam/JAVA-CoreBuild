// import java.io.*;

// class CompileEx {
//     public static void main(String[] arg) {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String name = br.readLine();                // Shows this exception that means it's compile-time
//         // Error: unreported exception IOException; must be caught or declared to be thrown

//         System.out.println(name);
//     }
// }

// class RunEx {
//     public static void main(String[] args) {
//         int arr[] = new int[5];

//         for (int i=0; i<=arr.length; i++) {             // It was runtime exception not caught compiletime
//             System.out.println(arr[i]);
//         }

//         // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 at RunEx.main(prog1.java:18)
//     }
// }