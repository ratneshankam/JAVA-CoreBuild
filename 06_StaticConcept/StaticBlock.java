class StaticBlock {
    static {
        System.out.println("Inside static block1");
    }
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        System.out.println("Inside main()");

        StaticBlock obj = new StaticBlock();
        System.out.println(obj.x);
    }

    static {
        System.out.println("static block2");
        System.out.println(y);
    }
}

class Another /*extends StaticBlock*/ {
    static {
        System.out.println("Inside another's static");
    }
    public static void main(String[] args) {
        System.out.println("Inside another main()");

    }
}