class MyThread extends Thread {
    public void run() {
        System.out.println("In run");
        System.out.println("Mythread: " + Thread.currentThread().getName());
        
        AnotherThread obj = new AnotherThread();
        obj.start();
    }

}

class AnotherThread extends Thread {
    public void run() {
        System.out.println("AnotherThread: " + Thread.currentThread().getName());
    }
}
class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        System.out.println("Demo: " + Thread.currentThread().getName());

        // AnotherThread atobj = new AnotherThread();
        // atobj.start();

    }
}