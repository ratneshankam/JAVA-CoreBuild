class StaticVarMeth {
    static int x = 10;
    static String s = "sString";

    /*static*/ void disp() {
        System.out.println(x);
        System.out.println(s);
    }
}

class Client {
    public static void main(String[] args) {
        System.out.println(StaticVarMeth.x);
        System.out.println(StaticVarMeth.s);
        StaticVarMeth.disp();
    }
}