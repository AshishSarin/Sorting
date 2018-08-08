package com.sarin;

public class BubbleSort
{
    private int[] a;

    public BubbleSort(int[] a)
    {
        this.a = a;
    }


    public int[] sort()
    {
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    // swap
                    swap(j, j+1);

                }
            }
        }
        return a;
    }

    private void swap(int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
