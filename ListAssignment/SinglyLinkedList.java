public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        // your code here
        head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.value == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.value != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    public void printValues()
    {
        Node values = head;
        while (values != null)
        {
            System.out.print(values.value +" \n");
            values = values.next;
        }
    }
}