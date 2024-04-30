package com.gl.linkedlist;

public class SinglyCircular {

    private static NodeSinglyCircular head;

    // Method to get the size of the circular singly linked list
    public static int getSize() {
        int count = 0;
        NodeSinglyCircular temp = head;
        if (head != null) {
            count++;
            temp = temp.nextNode;
            while (temp != head) {
                count++;
                temp = temp.nextNode;
            }
        }
        return count;
    }

    // Method to display the circular singly linked list
    public static void display() {
        NodeSinglyCircular temp = head;
        System.out.println(head.data);
        temp = head.nextNode;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
        System.out.println();
    }

    // Method to insert a node at a given position in the circular singly linked list
    public static void insertAtGivenPosition(int position, int data) {
        NodeSinglyCircular newNode = new NodeSinglyCircular(data);

        if (position == 1) {
            NodeSinglyCircular temp = head;
            newNode.nextNode = temp;
            while (temp.nextNode != head) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
            head = newNode;
            display();
        } else if (position > 1) {
            if (position == getSize() + 1) {
                addLastNode(data);
                return;
            } else if (position > getSize() + 1) {
                System.out.println("Invalid position");
                return;
            } else {
                NodeSinglyCircular temp = head;
                int count = 1;
                while (count < position - 1 && temp != null) {
                    temp = temp.nextNode;
                    count++;
                }
                while (temp != head) {
                    System.out.println(temp.data);
                    temp = temp.nextNode;
                }

                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                display();
            }
        } else {
            System.out.println("Invalid position");
        }

    }

    // Method to add a node at the last position of the circular singly linked list
    public static void addLastNode(int data) {
        NodeSinglyCircular newNode = new NodeSinglyCircular(data);

        if (head == null) { // If the list is empty, make newNode the head
            head = newNode;
            newNode.nextNode = head; // Make it circular
        } else {
            NodeSinglyCircular temp = head;
            while (temp.nextNode != head) {
                temp = temp.nextNode; // Move to the last node
            }
            temp.nextNode = newNode; // Insert newNode at the end
            newNode.nextNode = head; // Make it circular
        }
        display(); // Display the updated list
    }

    public static void main(String[] args) {
        head = new NodeSinglyCircular(10);
        NodeSinglyCircular first = new NodeSinglyCircular(20);
        NodeSinglyCircular second = new NodeSinglyCircular(30);
        NodeSinglyCircular third = new NodeSinglyCircular(40);

        //forward reference
        head.nextNode = first;
        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = head;

        display();
        insertAtGivenPosition(1, 0);
        insertAtGivenPosition(2, 5);
        insertAtGivenPosition(7, 50); //adding last node
        insertAtGivenPosition(20, 0); // Trying to insert at position 20, which is invalid
        insertAtGivenPosition(0, 0); // Trying to insert at position 0, which is invalid

    }
}
