import java.util.*;

public class Lec_1To12_JavaBasics {
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n + 1; i++) {
            System.out.print("*");
        }
    }

    public static void invertedStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // OR
        // for(int i = 1; i<=n; i++) {
        // for(int j = 1; j<= n-i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }

    public static void halfPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterPattern(int n) {
        // for(int i = 1; i<=n; i++) {
        // for(int j = 1; j<=i; j++) {
        // System.out.print((char)(64+(j)));
        // }
        // System.out.println();
        // }                                        //  ...SPECIAL
        int ch = (char) 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void selfMadePyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = i; space <= n - 1; space++) {
                System.out.print("_");
            }
            for (int val = 1; val <= i; val++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void factorialnumber(int n) {
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac *= i;
        }
        // OR
        for (int i = 1; i <= 1; i++) {
            fac *= i;
        }
        System.out.println("The factorial is " + fac);
    }

    public static void fibonacchinumber(int n) {
        int t1 = 0, t2 = 1;
        int nextTerm = t1 + t2;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(0 + " ");
            } else if (i == 2) {
                System.out.print(1 + " ");
            } else {
                t1 = t2;
                t2 = nextTerm;
                nextTerm = t1 + t2;
                System.out.print(nextTerm + " ");
            }
        }
    }


    public static void sumOfOddSumEvenSum(int x) {
        Scanner sc = new Scanner(System.in);
        int number, evenSum = 0, oddSum = 0, choice;
        do {
            System.out.print("Enter the number : ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number; // U have to initialize the variable to performing operation like this
            } else if (number % 2 != 0) {
                oddSum += number; // U have to initialize the variable to performing operation like this
            }
            System.out.println("Do you want to continue; " +
                    "if yes press 1 else press 0 : ");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("The sum of odd numbers: " + oddSum);
        System.out.println("The sum of even numbers: " + evenSum);
    }

    public static void MultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
            // System.out.println();                        // comparing this
            // return (n * i);
            // System.out.println();                        // getting error ^LookUp
        }
        // return 0;
    }

    public static String LeapYear(int n) {
        boolean a = ((n % 4 == 0) && (n % 400 == 0) ) ? true:false;
        boolean b = ((n % 4 == 0) && (n % 100 == 0) && (n % 400 != 0)) ? true:false;
        boolean c = ((n % 4 == 0) && (n % 100 != 0)) ? true:false;
        
        if( (a == true) || (b == true) || (c == true) ) {
            // System.out.println("Given year is prime");
            return "Leap Year";
        } else {
            // System.out.println("Not a prime year");
            return "Not Leap Year";
        }
    }

    public static int multiply(int a, int b) {
        int mul = a*b;
        return mul;
    }
    public static int factorial(int n) {
        int fac = 1;
        for (int i=1; i<=n; i++) {
            fac *= i;
        }
        return fac;
    }
    public static int bincoeff(int n, int r) {
        // int factorialN = 1;
        // int factorialR = 1;
        // int factorialNoMinusR = 1;
        // for (int i = 1; i<=n; i++) {
        //     factorialN *= i;
        // }
        // for (int i = 1; i<=r; i++) {
        //     factorialR *= i;
        // }
        // for (int i = 1; i<=(n-r); i++) {
        //     factorialNoMinusR *= i;
        // }
        // return (factorialN/(factorialR * factorialNoMinusR));

        int nfac = factorial(n);
        int rfac = factorial(r);
        int nmiusrfac = factorial(n-r);
        // return (nfac)/(rfac * nmiusrfac);
        int bincoeff = (nfac)/(rfac * nmiusrfac);
        return bincoeff;
        
    }

    public static boolean isPrime(int n) {
        // Corner cases
        if (n == 2) {
            return true;
        } else if (n==1) {
            return false;
        }
        // boolean isPrime = true;
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                // isPrime = false;
                // break;
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static int binaryToDeci(int n) {
        int dec = 0;
        int lastDigit = 0;
        for (int i = 0; i<100; i++) {           // n > 0 or i<100
            lastDigit = n % 10;
            dec += lastDigit * ((int)Math.pow(2, i));
            n/=10;
        }
        // while (n>0) {
        //     lastDigit = n % 10;
        //     dec += lastDigit * (int)Math.pow(2, pow);
        //     pow++;
        //     n /= 10;
        // }
        return dec;
    }

    public static int DeciToBina(int n) {
        int bin = 0;
        int pow = 0;
        int rem = 0;
        for (pow = 0; n>0; pow++) {             // n>0 or pow<100
            rem = n % 2;
            bin += (rem * (int)(Math.pow(10, pow)));
            n /= 2;
        }
        // while (n>0) {
        //     rem = n % 2;
        //     bin += (rem * (int)Math.pow(10, pow));
        //     pow++;
        //     n /= 2;
        // }
        return bin;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void palindrome(int n) {
        int actualnum = n;
        int reverse = 0;
        int lastDigit = 0;
        for (int i = 0; n>0; i++) {
            lastDigit = n % 10;
            // reverse = (reverse * 10) + lastDigit;
            reverse += lastDigit * (int)(Math.pow(10, i));
            n /= 10;
        }
        System.out.println(reverse);
        if (actualnum == reverse) {
            System.out.println("The given number " + actualnum + " is palindrome");
        } else {
            System.out.println("The given number " + actualnum + " is NOT palindrome");
        }
    }

    public static void sumOfDigits(int n) {
        int sum = 0;
        int lastDigit = 0;
        while(n>0) {
            lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void HollowRectanglePattern(int rows, int colmns) {
        for (int i = 1; i<=rows; i++) {
            for(int j = 1; j<=colmns; j++) {
                if (i==1 || j==1 || i==rows || j==colmns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidnumbers(int n) {
        // for (int i = 1; i<=n; i++) {
        //     int count = 1;
        //     for (int j = n; j>=i; j--) {
        //         System.out.print(count);
        //         count++;
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i<=n; i++) {
            for (int j =1; j<=(n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydSTrianglePattern(int n) {
        int count = 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        
    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
               if ((i+j) % 2 == 0) {
                System.out.print("1");
               } else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        for (int i=1; i<=(n); i++) {
            for (int j=1; j<=(i); j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++){
                System.out.print("_");
            }
            for (int k = 1; k<=i; k++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(i-1); space++) {
                System.out.print("_");
            }
            for (int k = 1; k<=n-i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterflypart2(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                if (j==1 || i==1|| i==n || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(1+2*(i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(1+2*(i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryToDeci(n);
    }
}



// char ch = 'A';
        // for (int i = 1; i<=4; i++) {
        //     // for(int space = i; space<= 3; space++) {
        //     //     System.out.print("_");
        //     // }
        //     // char ch = 'A';
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i<=4; i++) {
        //     for(int j = 1; j<=4; j++) {
        //         if (i==1 || j==1 || i==4 || j==4) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
















// noon racecar madam maam 

/*
    divisible by 4 and not divisible by 100
    divisible by 4 and divisible by 400

*/

// for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<=n; i++) {
        //     for(int j = n; j>=i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
