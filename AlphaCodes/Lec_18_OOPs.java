class Lec_18_OOPs {
    public static void main(String args[]) {
        Test t = new Test();
        System.out.println(Test.b + Test.a);

    }
}

class Test {
    static int a = 10;
    static int b;
    static void changeB() {
        b = a * 3;
    }
    
}

interface Herbivors {
    void eat();
    void walk();
}
interface Carnivors extends Herbivors {
    void eat();
    void walk();
}
abstract class species {
    int color = 4;
    species() {
        System.out.println("inside species constructor...");
        this.color = color;
    }
    void ab() {
        System.out.println("this is a abstract class");
        this.color = 6;
    }
    abstract void abfunc();
}
class Animal extends species {
    public void walk() {
        System.out.println("walk");
    }
    public void eat() {
        System.out.println("eat veggies");
    }
    void abfunc() {
        System.out.println("from abfunc");
    }
    Animal() {
        System.out.println("Animal constructor called...");
    }
    
    void eats() {
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called...");
    }
    
    void eats() {
        System.out.println("horse eats");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called...");
    }
    void eats() {
        System.out.println("mustang eats");
    }
}

class Student {
    String name;
    int age;
    float percentage;
    int marks[];

    // copy construtor          ....read about lazy copy
    Student(Student s1) {
        // marks = new int[3];          //deep copy part
        this.name = s1.name;
        this.age = s1.age;
        // this.marks = s1.marks;       // shallow copy
        for (int i=0; i<3; i++) {       //deep copy part             
            this.marks[i] = s1.marks[i];
        }
    }
    
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int age) {
        marks = new int[3];
        this.age = age;
    }
    
    // void calcPercentage(int phy, int chem, int math) {
    // percentage = (phy + chem + math) / 3;
    // }

}

class BankAccount {
    public String username;
    private String password;

    void setpass(String pass) {
        password = pass;
    }
}

class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}