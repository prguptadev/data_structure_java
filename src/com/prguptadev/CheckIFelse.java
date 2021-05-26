package com.prguptadev;

public class CheckIFelse {



    public static void main(String[] args) {
        Inclusion inclusion = new Inclusion();
        Node node = new Node();
        node.setCurr(Curency.valueOf(inclusion.getAa()));

        String ss = node.getCurr().toString();

        System.out.println("cntry code.. "+ ss);
    }
}
