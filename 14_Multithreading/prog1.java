class Demo {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<20; i++) {
            System.out.println("Loop1->" + i);
        }
        for (int i=0; i<20; i++) {
            System.out.println("Loop2-> " + i);
            Thread.sleep(3000);                     //If exception not handled -> error: unreported exception InterruptedException; must be caught or declared to be thrown
        }
    }
}