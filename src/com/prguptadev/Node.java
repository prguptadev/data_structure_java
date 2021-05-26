package com.prguptadev;

public class Node {
    int data;
    Node next;

    Curency curr;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Curency getCurr() {
        return curr;
    }

    public void setCurr(Curency curr) {
        this.curr = curr;
    }
}
