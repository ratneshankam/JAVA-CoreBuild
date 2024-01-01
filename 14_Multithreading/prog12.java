class MyThread extends Thread {
    public void run() {
        System.out.println("Mythread: " + Thread.currentThread());
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Thread-0");
        }
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo: " + Thread.currentThread());
        for (int i = 0; i < 15; i++) {
            System.out.println("Main Thread");
        }

        MyThread obj = new MyThread();
        obj.start();
        // obj.yield();

        System.out.println(Thread.currentThread());
    }
}

