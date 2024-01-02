// Most Important (creating thread pool)
class MyThread extends Thread {
    MyThread(ThreadGroup tg, String str) {
        super(tg, str);                     // Thread(ThreadGroup, String) -> get's called
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException ie) {
            System.out.println(ie.toString());
        }
    }

    
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        // Way-1
        ThreadGroup ptg = new ThreadGroup("Core2web");
        MyThread obj = new MyThread(ptg, "C/cpp");                      
        MyThread obj1 = new MyThread(ptg, "Java");                      
        MyThread obj2 = new MyThread(ptg, "Python");                      
        obj.start();
        obj1.start();
        obj2.start();

        // Way-2
        ThreadGroup ctg = new ThreadGroup(ptg, "Incubator");
        MyThread cobj1 = new MyThread(ctg, "flutter");
        MyThread cobj2 = new MyThread(ctg, "reactJS");
        MyThread cobj3 = new MyThread(ctg, "springBoot");
        cobj1.start();
        cobj2.start();
        cobj3.start();

        System.out.println(ptg.activeCount());
        System.out.println(ptg.activeGroupCount());

    }
}

