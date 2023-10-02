class C2W_StringBuffer {
    static void basicSB() {
        // In String
        String str = "Ratnesh";
        System.out.println(System.identityHashCode(str));
        str = str.concat("Ankam");          // differ in IdentityHC due to 'new' object creation internally
        System.out.println(System.identityHashCode(str));

        // In StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(System.identityHashCode(sb));
        sb = sb.append("Ankam");
        System.out.println(System.identityHashCode(sb));
    }
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer("");
        StringBuffer sb1 = new StringBuffer("Ram");

        System.out.println(sb.capacity());
        // System.out.println(sb.length());
        System.out.println(sb1.capacity());
        // System.out.println(sb1.length());

        // sb.append("ratneshkiranankamratneshkiranankam123");     
        sb.append("ratneshkiranankam");     
        System.out.println(sb.capacity());
        // System.out.println(sb.length());

        sb.append("ratneshkiranankam1");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer sb2 = new StringBuffer();
        // StringBuffer declared with it's initial capacity
        StringBuffer sb3 = new StringBuffer(100);       // It saves our cpu memory
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());

        

    }
}