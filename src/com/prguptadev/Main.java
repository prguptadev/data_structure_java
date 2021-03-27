package com.prguptadev;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 20;
        array[1] = 10;
        array[2] = -20;
        array[3] = 90;
        array[4] = 20;
        array[5] = -10;
        array[6] = 20;
        // array[7] = 40; java.lang.ArrayIndexOutOfBoundsException:
        int index = -1;
        for (int i = 0; i < array.length; i++) {  /// O(n)  linear
            System.out.println(array[i]);
            if (array[i] == -10) {
                index = i;
                break;
            }
        }
        System.out.println("index == " + index);
    }
}
