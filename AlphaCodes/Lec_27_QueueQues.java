import java.util.*;
import java.util.LinkedList;

class QueueQues {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && (freq[q.peek() - 'a'] > 1)) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void interleave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < (size / 2); i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void queueReversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static class stack {
        Deque<Integer> s = new LinkedList<>();

        public void push(int data) {
            s.addLast(data);
        }
        public int pop() {
            return s.removeLast();
        }
        public int peek() {
            return s.getLast();
        }
    }
    public static class queue {
        Deque<Integer> q = new LinkedList<>();

        public void add(int data) {
            q.addLast(data);
        }
        public int remove() {
            return q.removeFirst();
        }
        public int peek() {
            return q.getFirst();
        }
    }

    public static void main(String[] args) {
        // Deque<Integer> q = new LinkedList<>();
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}