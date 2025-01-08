package LinkedList;

import java.util.LinkedList;

public class BasicLinkedList {
    public static void main(String[] args) {
        // basics();
        custom();
    }

    // Custom Linked List
    public static void custom() {
        CustomLinkedList linkedList = new CustomLinkedList();
        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        linkedList.displayContents();
        linkedList.deleteBackHalf();
        linkedList.displayContents();
    }

    // Basic LinkedList
    public static void basics() {
        // liked list is an data structure in java which stores data one after other aka
        // linear data structure
        // data is not stored at a perticular location instead they are linked by
        // pointers
        // each element is kown as node
        // First node is called head and last node is called tail
        // suppose if you have 6->9->8->7->null (here null refers to the last item of
        // linked list) and we want to remove 8 and 7
        // we d0 6->9->null which removes the rest of the node

        LinkedList<String> list = new LinkedList<>();
        list.add("mann");
        list.add("Ninad");
        list.add("Fenil");
        list.add("Pregnesh");
        list.add("Khushbu");

        // contains checks if the linklist contains certain element, here it will check
        // if it contains mann, outputs boolean
        System.out.println(list.contains("mann"));

        // shows the size of linked list
        System.out.println(list.size());
        list.removeFirst();

        for (String item : list) {
            System.out.print(item + "->");
        }

        list.forEach(x -> System.out.print(x + "->"));

    }

}
