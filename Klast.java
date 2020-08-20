
package com.asignment2;
//4
import java.util.LinkedList;

class Klast {
    Node head;
=
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;

   
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;
            temp = head;

       
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args)
    {
        Klast llist = new Klast();
        llist.push(45);
        llist.push(23);
        llist.push(67);
        llist.push(8);

        llist.printNthFromLast(4);
    }
}