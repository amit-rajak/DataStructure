package com.datastructure.linkedList;


import java.util.HashSet;

public class deleteDups {
    public static void main(String[] args) {
        Node<Integer> head= new Node<>(1);
        Node<Integer> node1= new Node<>(2);
        Node<Integer> node2= new Node<>(2);
        Node<Integer> node3= new Node<>(4);
        Node<Integer> node4= new Node<>(4);
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


    }

    public static Node removeDups(Node head)
    {
        Node<Integer> temp=head;
        HashSet<Integer> set= new HashSet<>();

        while (temp!=null)
        {
           if(set.contains(temp.val))
           {

           }
        }
        return head;
    }

}
