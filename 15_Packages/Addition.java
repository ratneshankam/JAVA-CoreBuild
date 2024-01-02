package arithfun;

public class Addition {
    int n1 = 0, n2 = 0;
    public Addition(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    protected int add() {              // Try different access specifier
        return n1 + n2;
    }

}

// To COMPILE : javac -d . Addition.java