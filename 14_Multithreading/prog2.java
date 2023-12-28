// Creating thread using thread class

class MyThread extends Thread {
    public void run() {                                //If public not written ->Attempting to assign weaker access privileges; was public
        for(int i=0; i<10; i++) {
            System.out.println("Loop1->" + i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
class Demo {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        for (int i=0; i<10; i++)
            System.out.println("Loop2-> " + i);
    }
}