// Anonymous inner class in java

class Demo {
}

class Client {
    public static void main(String[] args) {
        Demo obj = new Demo() {               // It's a one time use
            void m1() {
                System.out.println("In anonymous");
            }
        };

        // obj.m1();
    }
}