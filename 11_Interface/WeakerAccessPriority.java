interface Demo {

    void fun();
    void gun();
}

class Child implements Demo {
    public void fun() {
        System.out.println("In Child fun");
    } 
    public void gun() {
        System.out.println("In Child gun");
    } 

}

class Client {
    public static void main(String[] args) {
        Demo obj = new Child();
        obj.fun();
    }    
}


// From bottom it gives error --->
/*
WeakerAccessPriority.java:11: error: gun() in Child cannot implement gun() in Demo
    void gun() {
         ^
  attempting to assign weaker access privileges; was public
WeakerAccessPriority.java:8: error: fun() in Child cannot implement fun() in Demo
    void fun() {
         ^
  attempting to assign weaker access privileges; was public
2 errors
 */