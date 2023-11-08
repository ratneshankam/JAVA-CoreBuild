import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {         // but this works
        for (int i=0; i<10; i++)     {
            System.out.println(i);

            try {
                Thread.sleep(3000);
                // new InputStreamReader(System.in).read();
            } catch(InterruptedException ex) {
                System.out.println(ex);
            } catch(RuntimeException ex) {
                System.out.println(ex);
            } catch(IOException ex) {               // Checked(compiletime exception) java do not allowed user to throw unnessasarily
                System.out.println(ex);
            }
        }
    }
}

//  error: unreported exception InterruptedException; must be caught or declared to be thrown

/* exception IOException is never thrown in body of corresponding try statement
            } catch(IOException ex) {            */