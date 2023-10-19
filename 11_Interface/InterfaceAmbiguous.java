interface Parent1 {

    void fun();
}

interface Parent2 {

    void fun();
}

class Child implements Parent1, Parent2 {
    // Both interface class having same functionality but different implementation is there then it generates ambiguous behaviour as it confuse for whom it will override
    
    public void fun() {
        System.out.println("In Chlid fun");
    }
}

class Client {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
        Parent1 obj1 = new Child();
        obj1.fun();
        Parent2 obj2 = new Child();
        obj2.fun();
    }
}
