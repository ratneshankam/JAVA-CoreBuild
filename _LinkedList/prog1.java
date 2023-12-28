class Node {
    int data = 0;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}
class LinkedList {
    Node head = null;
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void addAtPos(int pos, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (pos <= 0 || pos > countNode()+1) {
            System.out.println("Invalid input");
        }else if(pos == 1) {
            addFirst(data);
        } else if (pos == countNode()+1) {
            addLast(data);
        } else {
            while(pos-2 != 0) {
                temp = temp.next;
                pos--;                  // Important 
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    void printSLL() {
        if (head == null) {
            System.out.println("Empty LinkedList");
        } else {
            Node temp = head;
            while (temp != null) {      // temp.next
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
            // System.out.println(temp.data);
        }
    }

    int countNode() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}

class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addAtPos(3,25);
        
        // System.out.println(ll.countNode());
        ll.printSLL();
    }
}