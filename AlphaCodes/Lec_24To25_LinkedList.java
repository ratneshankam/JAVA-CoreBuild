public class Lec_24To25_LinkedList {
    public static class Node {
        int data;
        Node next;                  // reference variable
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step1 - Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step2 - new node's next = head
        newNode.next = head;        // Link

        // Step3 - head = new node
        head = newNode;
    }
    public void addLast(int data) {
        // Step1 - Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // Step2 - tail's next = new node
        tail.next = newNode;

        // Step3 - tail = new node
        tail = newNode;
    }
    public void print() {
        if(head==null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data) {
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        System.out.println();
        // i = idx-1;   temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() {
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;           // tail.data
        prev.next = null;
        tail = prev;
        size--;        
        return val;

    }
    public int itrSearch(int key) {
        Node temp = head;
        int i=0;
        while (i<=size) {                       // temp != null
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    // public int recSearch(int key) {
    //     if (head == null) {
    //         return -1;
    //     }
    //     int idx = 0;
    //     if (head.data != key) {
    //         head = head.next;
    //     idx = recSearch(key);
    //     idx++;
    //     }
    //     return idx;
    // }
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; 
    }
    public void deleteNthFromEnd(int n) {
        // size calculated
        int sz=0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            sz++;
        }

        if (n==sz) {
            head = head.next;       // removeFirst
            return;
        }

        // sz-n
        int i=1;
        int itoFind = sz-n;
        Node prev = head;
        while(i < itoFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;   // +1   -> turtle
            fast = fast.next.next;  // +2   -> hare
        }
        return slow;
    }
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Step 1 - Find mid
        Node midNode = findMid(head);

        // Step 2 - Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev;      // right half head
        Node left = head;

        // Step 3 - Check left half & right half
        while(right!=null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;        //Cycle exists
            }
        }
        return false;       //Cycle doesn't exists
    }
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }
        // remove cycle  ->  last.next = null
        prev.next = null;       

        //1->2->3->1 fully cycle corner case
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
    }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;                                          //  <-- imp step (modified slow-fast approach)
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    // mid Node
    }
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head) {
        // corner case
        if(head == null || head.next == null) {
            return head;    }

        // find mid
        Node mid = getMid(head);
        
        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

        // ll.head = ll.mergeSort(ll.head);                         // calling mergesort in main function like this
        
    }
    public void zigzagMerge() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alternate merge - zigzag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null) {
            nextL = left.next;              // defining nextL
            left.next = right;              // zigzag link
            nextR = right.next;             // defining nextR
            right.next = nextL;             // zigzag link

            // update
            right = nextR;
            left = nextL;
        }
    }
    public static void main(String args[]) {
        Lec_24To25_LinkedList ll = new Lec_24To25_LinkedList();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(6);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.zigzagMerge();
        ll.print();        
    }
}