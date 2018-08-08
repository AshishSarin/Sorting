package com.sarin;

public class Main
{

    public static void main(String[] args)
    {
        int[] unsortedArray = {45,-61, 89, 9, 12, 0, 23, 98, -54};
        display("Unsorted", unsortedArray);

        BubbleSort bubbleSortObj = new BubbleSort(unsortedArray);
        int[] bubbleSortArray = bubbleSortObj.sort();
        display("Bubble Sort", bubbleSortArray);


    }

    public static void display(String description, int[] elems)
    {
        System.out.print(description + " --> ");
        for(int elem : elems)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
