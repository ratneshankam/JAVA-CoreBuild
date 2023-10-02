// See the bytecode
class Instances {
    int x = 10;

    Instances() {
        System.out.println("Inside Constructor");
    }

    {
        System.out.println("Inside Instance block1");
    }
    public static void main(String[] args) {
        System.out.println("Inside Main()");

        Instances obj = new Instances();
    }

    {
        System.out.println("Inside Instance block2");
    }
}

// O/P:
// Inside Main()
// Inside Instance block1
// Inside Instance block2
// Inside Constructor