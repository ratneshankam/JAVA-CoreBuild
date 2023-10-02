
class Main {
    int instance = 10;                  // In java their is an instance variables and methods and not having global concept
    static int statInstance = 15;
    public static void main(String[] args) {
        // DataTypes

        byte x = 12;                        // Local Variable
        byte y = 12;
        x = (byte)(x + y);                  // error: incompatible types: possible lossy conversion from int to byte --> You need to typecast to remove error

        float n = 5.5F;                      // error: incompatible types: possible lossy conversion from double to float --> Removed by f or F by default is double
        System.out.println(n);

        System.out.println(x+y);

        System.out.println(new Main().instance);           // error: non-static variable instance cannot be referenced from a static context --> Removed by creating object or can be access by creating it as a static variable

        System.out.println(Main.statInstance);

        
    }
}