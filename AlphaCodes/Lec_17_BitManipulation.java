import java.util.*;

public class Lec_17_BitManipulation {
    public static void bitwiseOperator() {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~10);
        System.out.println(5 << 2);
        System.out.println(5 >> 1);
    }

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i);
        // int bit = ((n & bitMask) == 0) ? 0: 1;
        // return bit;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        // System.out.println(bitMask);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //    return clearIthBit(n, i);
        // } else {
        //    return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;                    //++i
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (1<<i) - 1;
        int b = (~0) << (j+1);
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(clearBitsInRange(10, 1, 2));

    }
}