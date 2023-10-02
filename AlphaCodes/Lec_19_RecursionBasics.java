public class Lec_19_RecursionBasics {
    public static void printDec(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    
    public static void printInc(int n) {
        if (n==1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        
        if (n==0) {
              return 1;          
        } else if (n<0) { return 0;}
        return n * factorial(n-1);
    }

    public static int printSumN(int n) {
        if (n==1) {
            return 1;
        }
        int sum = n + printSumN(n-1);
        return sum;
    }
    // Calculate the nth term in the fibonacci series
    public static int fibonacci(int n) {                        //O(2^n)
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length-1) { 
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i+1);
    }

    public static int lastOccur(int arr[], int key, int i) {
        
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if ((isFound == -1) && (arr[i] == key)) {
            return i;
        }
        return isFound;
    }

    public static int powerVari(int x, int n) {     //O(n)
        if (n == 0) {
            return 1;
        }
        return x * powerVari(x, n-1);
    }

    public static int optimizedPower(int x, int n) {    //O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n%2 != 0) {                             // if n is odd
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        // Base case
        if (n==1 || n==0) {
            return 1;
        }
        // Kaam
        // Vertical choice
        int fnm1 = tilingProblem(n-1);
        System.out.print(fnm1 + "*");
        // Horizontal choice
        int fnm2 = tilingProblem(n-2);          // try with 4 X n hint: modify base case too!
        System.out.println(" " + fnm2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        // Base case
        if (n==1 || n==2) {
            return n;
        }
        int fnm1 = friendsPairing(n-1);
        int fnm2 = (n-1) * friendsPairing(n-2);
        return fnm1 + fnm2;
    }

    public static void printBinaryString(int n, int lastPlace, String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinaryString(n-1, 1, str+"1");
        }
    }

    public static void keyOccurances(int[] arr, int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (key == arr[i]) {
            System.out.print(i+ " ");
        }
        keyOccurances(arr, i+1, key);
    }

    static String[] values = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void StringNumber(int n) {
        
        if (n == 0) {
            return;
        }
        int lastDigit = n%10;
        System.out.print(values[lastDigit] + " ");
        StringNumber(n/10);
    }

    public static int strLength(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // System.out.println(s.substring(1) + 1);
        return strLength(s.substring(1)) + 1;

    }

    public static int subStringCount(String str, int i, int j, int n) {
        if (n==1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = subStringCount(str, i+1, j, n-1) + subStringCount(str, i, j-1, n-1) - subStringCount(str, i+1, j-1, n-2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
    static int i=0;
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        
        if (n==1) {
            i++;
            // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        i++;        
        // transfer nth from src to desk
        // System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        
    }
}