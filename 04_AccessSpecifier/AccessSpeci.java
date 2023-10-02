class AccessSpeci {
    private AccessSpeci() {}
    private int x =  10;
    AccessSpeci(int y) {}
    public static void main(String[] args) {
        AccessSpeci obj = new AccessSpeci();
        obj.x=4;

        // Two imp classes
        String str = new String();
        // System s = new System();                // --> error: System() has private access in System
    }
}
class Another {
    public static void main(String[] args) {
        AccessSpeci obj = new AccessSpeci(4);
        // System.out.println(obj.x);           // --> error: x has private access in AccessSpeci

        // System.out.println(x);                  // error: cannot find symbol
    }
}

// ByteCode of --> javap -c .\AccessSpeci.class
// Compiled from "AccessSpeci.java"
// class AccessSpeci {
//   int x;
//  ****Notice that constructor is not there due to private initiated*****
//   public static void main(java.lang.String[]);
//     Code:
//        0: new           #8                  // class AccessSpeci  
//        3: dup
//        4: invokespecial #13                 // Method "<init>":()V
//        7: astore_1
//        8: aload_1
//        9: iconst_4
//       10: putfield      #7                  // Field x:I
//       13: return
// }