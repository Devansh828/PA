public class DoubleLinked {
    
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    static void printForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void printBackward(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = current.prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        return prev;
    }


    static Node addFront(int n, Node head) {
        Node newNode = new Node(n);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    static Node deleteFront(Node head) {
        if (head == null) {
            return null;
        }
        Node newHead = head.next;
        if (newHead != null) {
            newHead.prev = null;
        }
        return newHead;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        printForward(head);
        // printBackward(fourth);

        // head=reverse(head);

        // System.out.println("\nAfter reversing the linked list:");

        // printForward(head);

        head = addFront(5, head);

        printForward(head);

        head=deleteFront(head);

        printForward(head);

    }

}
