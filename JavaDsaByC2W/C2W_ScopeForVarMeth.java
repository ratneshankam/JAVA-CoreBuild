class C2W_ScopeForVarMeth {
    static int y = 10;  
    public static void main(String[] args) {
        int x = 20;
        // int y = 50;              // Duplicate local variable
        {
            int y = 1;
            System.out.println(x+y);
        }
        {
            int y = 2;
            System.out.println(x+y);
        }
        System.out.println(x+y);
    }
}