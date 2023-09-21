class C2W_ControlStatements {
    // Code by sir's (not optimized)

    static void primeNum() {
        int n = 5;
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("It's prime");
        } else {
            System.out.println("It's not prime");
        }
    }

    static void perfectNum() {
        int n = 6, perfect = 0;

        for(int i=1; i<n; i++) {
            if (n%i==0) {
                perfect += i;
            }
        }
        if (perfect == n) {
            System.out.println("It's perfect num");
        } else {
            System.out.println("It's not a perfect num");
        }
    }

    static void armstrongNum() {
        Integer n = 153, temp = n, sum = 0;

        int count = n.toString().length();                      // Important line

        while(n!=0) {
            int rem = n%10;
            sum += (int)Math.pow(rem, count);                   // Math.pow() by default returns double value
            n /= 10;
        }

        if (sum == temp) {
            System.out.println("It's armstrong");
        } else {
            System.out.println("It's not an armstrong");
        }
    }

    static void duplicateSwitchCase() {
        // int x = 'B';
        char ch = 65;
        
        switch (ch)   {
            case 66:
                System.out.println("in 66");
            //     break;
            // case 'B':                                                               // error: duplicate case label
                System.out.println("in B");
                break;
            case 65:
                System.out.println("in 65");
                // break;
            // case 'A':                                                           // error: duplicate case label
                System.out.println("in A");
                break;
            default:
                System.out.println("default case");
        }
    }

    static void literalSwitch() {
        // int x = 3, a=2, b=1;
        String str = "mon";
        // double d = 2.2;

        // Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
        
        // error: constant expression required
        switch (str) {
            // case a:
            //     System.out.println("in a");
            //     break;

            // case b:
            //     System.out.println("in a");
            //     break;

            // case a+b:
            //     System.out.println("in a");
            //     break;

            // case 2+3+'A':
            //     System.out.println("in a");
            //     break;

            // case "mon":
            //     System.out.println("in a");
            //     break;

            // case 3:
            //     System.out.println("in a");
            //     break;
            default:
                System.out.println("in default");
                break;
        }
    }

    static void nestedSwitch() {
        System.out.println("Oh Pune!");

        String str = "veg";                     // In strings 'veg' gives an error: not a statement
        switch(str) {
            case "veg":
                String str1 = "paneer";
                switch(str1) {
                    case "palak paneer":
                        System.out.println("Your order is palak paneer");
                        // break;
                    case "paneer":
                        System.out.println("Your order is simple paneer");
                }
                break;                                  // Important Line
            case "Nonveg":
                String str2 = "chicken";
                switch(str2) {
                    case "chicken":
                        System.out.println("Your order is chicken");
                        break;
                    case "fish":
                        System.out.println("Your order is fish");
                }
                break;
            default:
                System.out.println("Are you looking for something else?");
        }
    };
    public static void main(String[] args) {
        
        
    }
}