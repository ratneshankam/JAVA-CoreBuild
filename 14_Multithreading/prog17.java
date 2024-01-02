import java.util.concurrent.*;
// ThreadPoolExecutor is the most derived class used this to create threadpool
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
        
        ThreadPoolExecutor type1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        ThreadPoolExecutor type2 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        for (int i=1; i<=5; i++) {
            MyThread obj = new MyThread(i);
    
            type1.execute(obj);
        }
        for (int i=1; i<=5; i++) {
            MyThread obj = new MyThread(i);
    
            type2.execute(obj);
        }
    
        type1.shutdown();
        type2.shutdown();
    }
}