package laba4;

import javax.swing.*;
import java.util.Arrays;

public class BubbleSort implements InfoSort {
    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }
    public  int[] bubbleSort() {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++)
        {
            for (int j = 1; j < (len - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    @Override
    public int[] showInfo() {
        int[] arr=bubbleSort();
        return arr;
    }
}