public class C2W_String {
    static void basicString() {
        String str = "scp";                                     // It's a String literal goes on scp (if declare & initialized this.)
        String newStr = new String("onHeap");        // Anything with new goes on Heap
        char Arr[] = new char[] { 'c', '2', 'w' };

        System.out.println(str);
        System.out.println(newStr);
        System.out.println(Arr);

        char cArr[] = new char[] { 'c', '2', 'w' };

        System.out.println("Your String: " + cArr);
        System.out.println(cArr + "Your String: ");
    }

    static void diffIdentityHashCode() {
        int intC = 'A';
        int intI = 65;

        char charC = 'A';
        char charI = 65;

        System.out.println(System.identityHashCode(intC));
        System.out.println(System.identityHashCode(intI));

        System.out.println(System.identityHashCode(charC));
        System.out.println(System.identityHashCode(charI));

        // Integer Cache
        int a[] = {12,13};
        Integer A[] = {12,13};
        System.out.println(System.identityHashCode(A[0]));
        System.out.println(System.identityHashCode(a[0]));

        // String Contant Pool
        String s1 = "scp";
        String s2 = "scp";
        String s3 = new String("scp");
        String s4 = new String("scp");      // "new" means strictly new object created
    
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));


        // Strings can perform concatination
        String str1 = "Ratnesh", str2 = "Ankam";
        String str = "RatneshAnkam";
        String newStr = str1 + str2;            // internal append()->(+) same --> string created with "new" so identityHC is differ
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(newStr));
    }

    static void stringHC() {
        String s1 = "scp";
        String s2 = "scp";
        String s3 = new String("scp");
        String s4 = new String("scp");      // "new" means strictly new object created
    
        // Hash Code method returns id' based on content not memory alloc
        System.out.println((s1).hashCode());
        System.out.println((s2).hashCode());
        System.out.println((s3).hashCode());
        System.out.println((s4).hashCode());
    }

    public static void main(String[] args) {
        // String in java is immutable (unchangable) --> constant


        System.out.println("Ashish".compareToIgnoreCase("ashish"));        // 65-97 --> (A-a)  -->  ASCII code comparison

        String str = "Ratnesh";
        System.out.println(System.identityHashCode(str));
        str = str.concat("Ankam");
        System.out.println(System.identityHashCode(str));
    }

}
