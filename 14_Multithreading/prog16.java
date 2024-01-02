import java.util.concurrent.*;

class MyThread implements Runnable {
    int num;
    MyThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(Thread.currentThread() + "start task: " + num);
        dailyTask();
        System.out.println(Thread.currentThread() + "End task: " + num);
    }

    public void dailyTask() {
        try {
            Thread.sleep((5000));
        } catch (InterruptedException ie) {
            System.out.println(ie.toString());
        }
    }
}

class Demo {
    public static void main(String[] args) {
        
        // ExecutorService eService = Executors.newFixedThreadPool(5);
        ExecutorService eService = Executors.newCachedThreadPool();
        for (int i=1; i<=5; i++) {
            MyThread obj = new MyThread(i);
    
            eService.execute(obj);
        }
    
        eService.shutdown();
    }
}