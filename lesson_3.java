package ru.geekbrains.lesson3;

import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invertArray()) + "\n");
        System.out.println(Arrays.toString(fillArray()) + "\n");
        System.out.println(Arrays.toString(changeArray()) + "\n");
        fillDiagonals(7);
        System.out.println(Arrays.toString(fillInitialValue(5, 7)) + "\n");
    }
    public static int[] invertArray() {
        int[] arr ={0, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    public static int[] changeArray() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *=2;
            }
        }
        return arr;
    }

    public static void fillDiagonals (int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            int rowLenght = arr[i].length;
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (j == rowLenght - 1 - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[] fillInitialValue (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}
