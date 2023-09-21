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
     
    }
}