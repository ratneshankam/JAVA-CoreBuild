// See the diagram on 59 page no.
class Player {
    int jerNo = 0;
    String name = null;

    Player(int jNo, String pName) {
        jerNo = jNo;
        name = pName;
    }

    void playInfo() {
        System.out.println(jerNo + " = " + name);

        System.out.println(System.identityHashCode(jerNo));
        System.out.println(System.identityHashCode(name));
    }
}

class client {
    public static void main(String[] args) {
        Player p = new Player(18, "virat");
        p.playInfo();
        Player p1 = new Player(10, "sachin");
        p1.playInfo();

        // argument passing Strings are goes in SCP
        Player p2 = new Player(7, new String("msd"));
        p2.playInfo();
        Player p3 = new Player(7, "msd");
        p3.playInfo();
        Player p4 = new Player(7, "msd");
        p4.playInfo();
    }
}