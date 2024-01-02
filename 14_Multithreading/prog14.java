// Protocol to assign name to Thread for creating multiple one

class MyThread extends Thread {
    MyThread() {
    }
    MyThread(String str) {
        super(str);                     // Thread(String) -> get's called
    }
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}

class Demo {
    public static void main(String[] args) {
        // Way-1
        MyThread obj = new MyThread();                      // error: actual and formal argument lists differ in length [which means we have to write no args constructor]
        obj.start();

        System.out.println(obj.getName());
        obj.setName("xyz");
        System.out.println(obj.getName());

        // Way-2
        MyThread obj1 = new MyThread("Xyz");
        obj1.start();

        System.out.println(obj1.getName());

    }
}

