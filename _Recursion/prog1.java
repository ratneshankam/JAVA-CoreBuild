class Demo {
    void funPrint(int num) {
        if (num == 0) {
            return;
        }
        funPrint(num-1);            // try -> num--, --num and println line before nested call
        System.out.println(num);

    }

    int numInc(int n) {
        if(n==0) {
            return n;
        }

        n = 5 + numInc(--n);
        return n;
    }

    int doubleRec(int n) {
        if (n <= 1) {
            return 1;
        }
        return doubleRec(n-2) + doubleRec(n-1);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.numInc(2));
        System.out.println(obj.doubleRec(5));
    }
}