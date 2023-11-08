// Anonymous Inner Class
class Demo {
    void marry() {
        System.out.println("disha patni");
    }

    void fun() {
        System.out.println("In fun");
    }

    void property() {
        System.out.println("car, flat, assets");
    }
}

class Client {
    public static void main(String[] args) {
        Demo obj = new Demo() {
            void marry() {
        System.out.println("kriti sanon");
        }

        void fun() {
            System.out.println("In fun");
        }
        };

        obj.marry();
        obj.fun();
        obj.property();
    }
}