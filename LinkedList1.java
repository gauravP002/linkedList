
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList1 {

    public static Node covertIntoLinkedList(int arr[]) {
        int l = arr.length;

        Node head = new Node(arr[0]);
        Node move = head;
        for (int i = 1; i < l; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return head;

    }

    public static Node removeHead(Node head) {
        head = head.next;
        return head;
    }

    public static Node removeTailOfLinkedList(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    public static Node deleteKthNode(Node head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }

        int count = 1;
        Node temp = head;
        Node pre = null;

        while (temp != null) {
            count++;
            if (count == k) {
                pre.next = pre.next.next;
            }
            temp = temp.next;
            pre = temp;
        }
        return head;

    }
    public static Node inserValInFirst(int val , Node head){
        Node temp = new Node (val , head);
        return temp;

   }

   public static Node inserNewVallast(int val , Node head){
    Node temp = new Node (val , head);
    return temp;

}

   
    public static void main(String[] args) {
        int[] arr = { 19, 2, 3, 4, 5 };
        Node val = covertIntoLinkedList(arr);
        // Node val1 = removeHead(val);
        // Node val2 = removeTailOfLinkedList(val);
        // Node val3 = deleteKthNode(val, 1);
        Node val4 = inserValInFirst(12, val);

        Node temp = val4;
        while (temp != null) {
            System.out.println(temp.data + " " + temp.next);

            temp = temp.next;
        }

    }
}
 