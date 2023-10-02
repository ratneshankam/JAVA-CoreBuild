import java.util.StringTokenizer;

class C2W_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("s,234,2.d", ",");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextElement());
            // System.out.println(st.nextToken());
        }

        System.out.println(st.countTokens());       
        // Due to traversal by cursor in nextElement() method is done and pointing at the end i.e it returns 0

        

    }
}