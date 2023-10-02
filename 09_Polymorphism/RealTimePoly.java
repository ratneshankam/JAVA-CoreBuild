class Ipl {
    void matchInfo(String t1, String t2) {
        System.out.println(t1 + " " + t2);
    }
    void matchInfo(String t1, String t2, String venue) {
        System.out.println(t1 + " " + t2 + " at " + venue);
    }
}

class Client {
    public static void main(String [] arg) {
        Ipl matchDay = new Ipl();
        matchDay.matchInfo("csk", "mi");
        matchDay.matchInfo("rcb", "kkr", "nmsa");       // narendra modi stadium ahmadabad
    }
}