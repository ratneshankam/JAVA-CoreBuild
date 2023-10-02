class Match {
    void matchType() {
        System.out.println("t20/oneDay/test");
    }
}
class Ipl extends Match {
    void matchType() {
        System.out.println("t20");
    }
}
class TestM extends Match {
    void matchType() {
        System.out.println("test");
    }
}

class Player {
    public static void main(String[] arg) {
        Match m = new Ipl();
        m.matchType();
    }
}