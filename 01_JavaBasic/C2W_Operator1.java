class C2W_Operator1 {
    void operatorIntro() {
        int x = 2, y = 4;
        // Arithmetic Operator --> follows order of precedence rule
        // 2 sub classes as Unary Operators  {++,-- for pre/post, +pre, -pre}
        // and Binary Operators  {*, /, %, +, -}
        System.out.println(x+x*y+y/x-x);                        
        System.out.println(+x);
        System.out.println(-x);

        // Relational Opeartors --> they returns boolean values
        // {<, >, <=, >=, ==, !=}
        
        // Logical Operators required boolean values to compare that means indirectly relational operators used
        // {!, ||, &&}

        // Conditional Operator
        // {?:}

        // Assignment operator not an relational one
        // {= , += , -= , *= , /= , %=}
        // Bitwise Operators
        // {~, <<, >>, &, |, ^, >>>}
    }

    static void trialAndError() {
        int x =4, y=5;
        // System.out.println(x+++++y);                     // It gives an error: unexpected type
        System.out.println(x++ + ++y);                      // But it works

        int a = 4;
        String s = (Integer.toString(a));
    }
    public static void main(String[] args) {
        // It's range is -128 to 127
        byte b = (byte)255;        // error: incompatible types: possible lossy conversion from int to byte
        // TypeCase works but gives different output like -1=127-128 and their addition is 255

        short s = (short)(Math.pow(2, 15)-1);
        System.out.println(s);
    }
}