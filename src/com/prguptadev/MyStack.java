package com.prguptadev;

public class MyStack {

    int stack[] = new int[5];
    int top=0;

    public void push(int data){
        stack[top] = data;
        top++;

    }

    public int  pop(){
        top--;
        int data = stack[top];
        stack[top] = 0;
       // System.out.println("pop top value -- "+stack[top]);

        return data;
    }

    public int  peek(){
        int data = stack[top-1];
        // System.out.println("pop top value -- "+stack[top]);

        return data;
    }

    public void show(){
        for(int a : stack){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(12);
        myStack.push(34);
        System.out.println("pop top value -- "+ myStack.pop());

        myStack.show();

    }
}
