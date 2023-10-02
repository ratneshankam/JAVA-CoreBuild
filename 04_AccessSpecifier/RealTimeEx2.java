// Example 2
class MacD {
    int item = 5;
    String product = "frize";

    void menu() {
        String menu1 = "veg";
        String menu2 = "non-veg";

        System.out.println(item);
        System.out.println(product);
    }
}

class User {
    public static void main(String[] args) {
        MacD obj = new MacD();
        obj.menu();
    }
}