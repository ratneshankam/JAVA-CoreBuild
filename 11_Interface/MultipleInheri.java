interface Parent1 {

    void fun();
}

interface Parent2 {

    void gun();
}

class Child implements Parent1, Parent2 {

    /*          IT FINDS FIRST IMPLEMENTED INTERFACE AND IF IT'S INITIALIZATION NOT 
                FOUNDS THEN RETURN ERROR
     * error: Child is not abstract and does not override abstract method gun() in
     * Parent2
     * class Child implements Parent2, Parent1{
     * 
     * error: Child is not abstract and does not override abstract method fun() in
     * Parent1
     * class Child implements Parent1, Parent2{
     * 
     */

    public void fun(){}
    public void gun(){}
}

class Client {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
        obj.gun();
    }
}
