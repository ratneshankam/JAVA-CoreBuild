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

        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
        System.out.println(t.getPriority());

        MyThread obj = new MyThread();
        obj.start();             
        // t.setPriority(11);                              // java.lang.IllegalArgumentException as [MAX_PRIORITY =10; MIN_PRIORITY = 1; NORM_PRIORITY = 5]
        
        System.out.println(t.getPriority());

        MyThread obj1 = new MyThread();
        obj1.start();

        System.out.println(t.getPriority());
        // System.out.println(t.getPriority());
    }
}