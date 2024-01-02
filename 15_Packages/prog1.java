import arithfun.Addition;
import java.io.*;

class Client extends Addition {
    Client(int a, int b) {
        super(a,b);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the numbers to add: ");
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

            // another folders Protected method trying to access by making child class
        Client obj = new Client(a,b);
        System.out.println(obj.add());

            // For public access 
        // Addition obj = new Addition(a,b);
        // System.out.println(obj.add());

    }
}