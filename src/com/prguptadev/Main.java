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

        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);

    }
}
