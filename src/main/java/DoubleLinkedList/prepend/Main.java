package DoubleLinkedList.prepend;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        myDLL.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();



    }




}


