class MyThread extends Thread {
    public void run() {
        System.out.println("Mythread: " + Thread.currentThread().getName());
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
    }
}
class Demo {
    public static void main(String[] args) {
        System.out.println("Demo: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread());

        MyThread obj = new MyThread();
        obj.start();             
        // obj.start();                                        // java.lang.IllegalThreadStateException
    }
}