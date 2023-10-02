import java.util.*;
import java.util.LinkedList;

class StackUisngDoubleQueue {
    public static class Stack1 {
        public static Queue<Integer> q1 = new LinkedList<>();
        public static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                System.out.println("we are inside q1 data is " + data + (!q1.isEmpty()));
                q1.add(data);
            } else {
                System.out.println("we are inside q2 data is " + data);
                q2.add(data);
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
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
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    // Method 2
    // add O(n) and remove & peek O(1)
    public static class Stack2 {
        public static Queue<Integer> q1 = new LinkedList<>();
        public static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        public static void push(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack1 q = new Stack1();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}