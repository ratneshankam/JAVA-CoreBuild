class MyThread extends Thread {
    public void run() {
        System.out.println("In run");
        System.out.println(Thread.currentThread().getName());
    }

    public void start() {
        System.out.println("In start method");
        run();
    }
}
class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        System.out.println(Thread.currentThread().getName());
    }
}