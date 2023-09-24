class C2W_cmdLineArg {
    // While running after compilation java C2W_cmdLineArg dinesh omkar atharv 
    public static void main(String...xarr) {
        // It calls variable no. of argument or ellipses
        String str[] = {"Ratan", "Ratan",};

        // Even the strings are same is not goes on scp every string is build by "new" keyword
        for(String x: xarr) {
            System.out.println(System.identityHashCode(x));
        }
        for(String x: str) {
            // Gives same identityHC as internally goes in scp
            System.out.println(System.identityHashCode(x));
        }
    }
}

// ******************************************************************
// public static void main(String[] xarr) {
//     for(String x: xarr) {
//         System.out.println(x);
//     }
// }