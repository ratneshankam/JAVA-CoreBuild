class MyThread extends Thread {
    public static Thread nmMain  = null;
    public void run() {
        System.out.println("Mythread: " + Thread.currentThread());
        
        try {
            nmMain.join();
        } catch(InterruptedException ie) {
            System.out.println(ie);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-0");
        }
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo: " + Thread.currentThread());

        MyThread.nmMain = Thread.currentThread();

        MyThread obj = new MyThread();
        obj.start();
        obj.join();                             // behaves like synchronization wait for the current thread task done/die.

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
        System.out.println(Thread.currentThread());
    }
}


// OUTPUT: |  [--> deadlock scenario]