class StaticInstanceSeq {
    int x = 10;
    static int y = 20;

    StaticInstanceSeq() {
        System.out.println("Inside Constructor");
    }

    static {
        System.out.println("Inside static block1");
    }

    {
        System.out.println("Inside Instance block1");
    }

    void StaticInstanceSeq() { System.out.println("In Method");}         // Same class/Constructor name allowed but not recommended

    public static void main(String[] args) {
        System.out.println("Inside main()");

        StaticInstanceSeq obj = new StaticInstanceSeq();
        obj.StaticInstanceSeq();
    }

    static {
        System.out.println("Inside static block2");
    }

    {
        System.out.println("Inside Instance block2");
    }
}

// BYTECODE
/*
Compiled from "StaticInstanceSeq.java"
class StaticInstanceSeq {
  int x;

  static int y;

  StaticInstanceSeq();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      13: ldc           #19                 // String Inside Instance block1   
      15: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      18: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      21: ldc           #27                 // String Inside Instance block2   
      23: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      26: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      29: ldc           #29                 // String Inside Constructor       
      31: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      34: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #31                 // String Inside main()
       5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: new           #8                  // class StaticInstanceSeq
      11: dup
      12: invokespecial #33                 // Method "<init>":()V
      15: astore_1
      16: return

  static {};
    Code:
       0: bipush        20
       2: putstatic     #34                 // Field y:I
       5: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       8: ldc           #37                 // String Inside static block1     
      10: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      13: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      16: ldc           #39                 // String Inside static block2     
      18: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      21: return
}
*/