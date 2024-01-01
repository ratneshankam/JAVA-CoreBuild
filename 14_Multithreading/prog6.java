class MyThread implements Runnable {
    public void run() {
        System.out.println("In run");
        System.out.println("Mythread: " + Thread.currentThread().getName());
    }
}
class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        // obj.start();             // erorr: cannot find symbol

        Thread t = new Thread(obj);
        t.start();

        System.out.println("Demo: " + Thread.currentThread().getName());

        // Priority of Thread
        System.out.println(t.getPriority() + " " + t.getName());
    }
}