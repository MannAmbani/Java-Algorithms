
package LinkedList;

//we can create our own linkedlist
public class CustomLinkedList {
    // this represents first iteam or head of list
    Node head;

    // this will print the content of the linked list
    public void displayContents() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;

        }
        System.out.println();
    }

    // delete back half of linked list
    public void deleteBackHalf() {
        // exits the function if it contains one or two nodes
        if (head == null || head.next == null) {
            head = null;

        }

        // will use two pointers, fast pointer will move twice as fast as slow
        Node slow = head;
        Node fast = head;
        // prev node will just run behind the slow node
        Node prev = null;
        // will check if the fast node or next node is not null
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;

    }
}