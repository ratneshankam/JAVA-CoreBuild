class MyThread extends Thread {
    public void run() {
        System.out.println("Mythread: " + Thread.currentThread());
        try {
            Thread.sleep(5000);   
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo: " + Thread.currentThread());

        MyThread obj = new MyThread();
        obj.start();             
        
        // Thread.sleep(2000);

        Thread.currentThread().setName("Master");

        System.out.println(Thread.currentThread());
    }
}