package com.datastructure.linkedList;

class Node1<E>
{
    E val;
    Node1<E> next;
    Node1<E> prev;

    public Node1(E val) {
        this.val = val;
        this.next = null;
        this.prev = null;

    }
}
public class deleteElement {
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

        printLinkListData(head);

        head=deleteLinkListData(head,0);

        System.out.println();
        printLinkListData(head);

    }

    public static void printLinkListData(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while (temp!=null)
        {
            System.out.print(temp.val +" -> ");
            temp= temp.next;
        }
    }

    //delete
    public static Node deleteLinkListData(Node<Integer> head,int pos)
    {
        Node<Integer> temp=head;

        if(pos==0)
        {
            return head.next;
        }
          for (int i=0;i<pos-1;i++) {
              temp = temp.next;
          }
         temp.next =temp.next.next;

        return head;
    }
}
