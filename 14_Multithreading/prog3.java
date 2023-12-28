class MyThread extends Thread {
    // public void run() throws InterruptedException {             // We can't throws exception -> overridden method does not throw InterruptedException
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Loop1->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
        
        for (int i=0; i<10; i++)
            System.out.println("Loop2-> " + i);
    }
}