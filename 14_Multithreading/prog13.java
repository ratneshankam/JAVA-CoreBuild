// ThreadGroup

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}

class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        System.out.println(obj.getName());

        // System.out.println(Thread.currentThread().getThreadGroup());
    }
}

