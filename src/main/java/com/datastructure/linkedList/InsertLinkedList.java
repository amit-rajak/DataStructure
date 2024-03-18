package com.datastructure.linkedList;
class Node<E>
{
    E val;
    Node<E> next;
    Node<E> prev;

    public Node(E val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class InsertLinkedList {
    public static void main(String[] args) {

        Node<Integer> head= new Node<>(1);
        Node<Integer> node1= new Node<>(2);
        Node<Integer> node2= new Node<>(3);
        Node<Integer> node3= new Node<>(4);
        Node<Integer> node4= new Node<>(5);
        Node<Integer> node5= new Node<>(6);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        printLinkedList(head);
      head=  InsertElementInPos(head,0,9);
        printLinkedList(head);
    }


    public static  void  printLinkedList(Node<Integer>head)
    {
        Node<Integer> temp=head;
        while (temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
       System.out.println();


    }

    // Insert
    public static  Node  InsertElementInPos(Node<Integer>head,int pos,int data)
    {
        Node<Integer> temp=head;
        Node<Integer> newNode= new Node<>(data);
        if(pos==0)
        {
            newNode.next=head;
            return newNode;
        }
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;


        return head;
    }
}



