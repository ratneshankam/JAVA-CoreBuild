import java.util.*;
class QueueUsingDoubleStack {
    public static class Queue1 {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add -> O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove -> O(1)
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // peek -> O(1)
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    // Method 2 add O(1) and remove and peek O(n)
    static class Queue2 {
        public static Stack<Integer> s1 = new Stack<>();
        public static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            // return s1.isEmpty() && s2.isEmpty();
            return s1.isEmpty();
        }

        public void add(int data) {
            s1.push(data);
        }

        public int remove() {
            // if (isEmpty()) {
            //     System.out.println("Stack is empty");
            //     return -1;
            // }
            int top = -1;
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    top = s1.pop();
                    s2.add(top);
                }
            } else {
                while (!s2.isEmpty()) {
                    top = s2.pop();
                    s1.add(top);
                }
            }
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    top = s1.pop();
                    if (s1.isEmpty()) {
                        break;
                    }
                    s2.add(top);
                }
            } else {
                while (!s2.isEmpty()) {
                    top = s2.pop();
                    if (s2.isEmpty()) {
                        break;
                    }
                    s1.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        Queue2 s = new Queue2();
        s.add(1);
        s.add(2);
        s.add(3);
       
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }

}
