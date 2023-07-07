package LinkedList.insert;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();




    }

}


