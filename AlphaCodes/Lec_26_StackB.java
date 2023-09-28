import java.util.*;
class StackB {
                                                            // Stack implementation for ArrayList
    // static class Stack {
    //     private static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }
    //     public static void push(int data) {
    //         list.add(data);
    //     }
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }
    // }
                                                             // Stack implementation for LinkedList
    // public static class Node {
    //     int data;
    //     Node next;
    //     public Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }                                       
    // static class Stack {
    //     public static Node head;
    //     public static int size;
    //     public static boolean isEmpty() {
    //         return head == null;
    //     }
    //     // push
    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         size++;
    //         if (isEmpty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     // pop
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;

    //         return top;
    //     }
    //     // peek
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }       
    
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();                                       // Noted
    }
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void findNextGreater() {
        int arr[] = {6, 8, 0, 1, 9};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--) {                   // backtrack
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3 push in s
            s.push(i);
        }
        
        for (int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }

        // next Greater Right
        // next Greater Left
        // next Smaller Right
        // next Smaller left
    }
    public static boolean isValidParenthese(String str) {
        Stack<Character> s = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {              // opening
                s.push(ch);
            } else {                                                // closing
                if (s.isEmpty()) {
                    return false;
                } else {
                    if (    (s.peek() == '(' && ch == ')')                  //()
                            || (s.peek() == '{' && ch == '}')               //{}
                            || (s.peek() == '[' && ch == ']')) {            //[]
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
            // System.out.print(ch);
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isDuplicateParenthese(String str) {
        Stack<Character> s = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {                // Valid str given else !s.isempty() && required
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;                        // duplicate
                } else {
                    s.pop();
                }
                        // Another way
                // while (s.pop() != '(') {
                //     count++;
                // }
                // if (count < 1) {
                //     return true;                     // duplicate
                // }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void maxAreaHistogram(int []arr) {
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // Next Smaller right
        Stack<Integer> s = new Stack<>();
        for (int i=arr.length-1; i>=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smller left
        s = new Stack<>();                                      // Empty stack
        for (int i=0; i<arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i=0; i<arr.length; i++) {
            int currArea = arr[i] * (nsr[i] - nsl[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum area of rectangle in historgram: " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxAreaHistogram(arr);
    }                                            

}
