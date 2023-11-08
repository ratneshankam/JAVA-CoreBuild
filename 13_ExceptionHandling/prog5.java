import java.io.*;
// Actual business logically code written
class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your age: ");         //It's like your giving prompt msg

        int age=0;
        try {
            age = Integer.parseInt(br.readLine());
        } catch(IllegalArgumentException ex) {
            System.out.println("Please Enter valid integer data: ");
            age = Integer.parseInt(br.readLine());

        // } catch(NumberFormatException ex) {                 //  error: exception NumberFormatException has already been caught
        //     System.out.println("Invalid input");
        // }

        } catch (RuntimeException ex) {
            System.out.println("runtime exception hierarchy");
        }
        
        System.out.println(age);
        // Int catch block child-to-parent hierarchy works!   

    }
}