// this and obj is prints same addre which prove that this pointer exists!!
class Demo {
    int x = 10;
    
    Demo() {                                         // Demo(Demo this)
        System.out.println("Inside constr");

        System.out.println(this);
        System.out.println(this.x);

    }

    void fun() {                                    // fun(Demo this)

        System.out.println(this);
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        Demo obj = new Demo();                      // Demo(obj)
        
        System.out.println(obj);            
        
        System.out.println(obj.x);

        obj.fun();                                  // fun(obj)        
    }

    // {
    //     // this.x = 20;
    //     System.out.println(x);
    // }

}