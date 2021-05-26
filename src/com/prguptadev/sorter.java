package com.prguptadev;

public class sorter {

    User user = new User();

    public static void main(String[] args) {

        int arr[]  = new int[10];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 0;
        arr[8] = 1;
        arr[9] = 0;
        int temp;

        for(int i=0; i<arr.length;i++)
System.out.println("arr- "+arr[i]);
        for(int i=0; i<arr.length;i++){
            if(arr[i]< arr[arr.length-i-1]){
                temp=arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
        }
        for(int i=0; i<arr.length;i++)
        System.out.println("arr-sorted  "+arr[i]);
    }




}
