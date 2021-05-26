package com.prguptadev;

import java.util.LinkedList;

public class SinLinkedList {
    Node head;

    static  class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(SinLinkedList sinLinkedList , int data){
        Node node =  new Node(data);

        if(sinLinkedList.head == null)
            sinLinkedList.head =node;
        else{
            Node n = sinLinkedList.head;
            while (n.next !=null){
                n = n.next;
            }
            n.next = node;
        }

    }

    public void insertAtStart(SinLinkedList sinLinkedList , int data){
        Node node = new Node(data);
        node.next = sinLinkedList.head;
        sinLinkedList.head = node;
    }

    public void insertAt(SinLinkedList sinLinkedList, int data , int index){
        Node node = new Node(data);
        if(index == 0)
            insertAtStart(sinLinkedList,data);
        else{
            Node n = sinLinkedList.head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public int  size(SinLinkedList sinLinkedList){
        Node n = sinLinkedList.head;
        int size = 0;
        while (n!=null){
            size++;
            n = n.next;
        }
        return size;
    }

    public void deleteByIndex(SinLinkedList sinLinkedList, int index){
        LinkedList linkedList= new LinkedList();
        if(index == 0)
            sinLinkedList.head = sinLinkedList.head.next;
        else {
            Node n = sinLinkedList.head;
            Node n1 = null;
            if(index<sinLinkedList.size(sinLinkedList)) {
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                System.out.println("founded and deleted at "+index+", value "+ n.next.data);
                n1 = n.next;
                n.next = n1.next;
                n1 = null;

            }
            else{
                System.out.println("OutofBoundIndex");
            }
        }
    }

    public  void show(SinLinkedList sinLinkedList){
        Node n = sinLinkedList.head;
        while (n!= null){
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {
        SinLinkedList sinLinkedList = new SinLinkedList();
        sinLinkedList.insert(sinLinkedList,232);
        sinLinkedList.insert(sinLinkedList,900);
        sinLinkedList.insert(sinLinkedList,123);
        sinLinkedList.insert(sinLinkedList,876);
        sinLinkedList.insertAtStart(sinLinkedList,999);
        sinLinkedList.insertAtStart(sinLinkedList,111);
        sinLinkedList.insertAt(sinLinkedList,786,2);
        sinLinkedList.insertAt(sinLinkedList,888,0);
        System.out.println("Size of singlelInked List " + sinLinkedList.size(sinLinkedList));
        sinLinkedList.deleteByIndex(sinLinkedList,0);
        System.out.println("Size of singlelInked List " + sinLinkedList.size(sinLinkedList));
        sinLinkedList.deleteByIndex(sinLinkedList,300);
        System.out.println("Size of singlelInked List " + sinLinkedList.size(sinLinkedList));
        sinLinkedList.deleteByIndex(sinLinkedList,4);
        sinLinkedList.show(sinLinkedList);
        System.out.println("Size of singlelInked List " + sinLinkedList.size(sinLinkedList));
    }
}
