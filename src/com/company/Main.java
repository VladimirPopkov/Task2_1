package com.company;

import java.util.Random;

public class Main {

    private final static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] arr = new int[ARRAY_SIZE];
        fillInPrintArray(arr);
        calcPrintSumAllElemArray(arr);
        findPrintMinElemArray(arr);
    }

    private static void fillInPrintArray(int[] arr){
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    private static void calcPrintSumAllElemArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Сумма всех элементов в массиве = " + sum);
    }

    private static void findPrintMinElemArray(int[] arr){
        int min = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Индекс минимального элемента массива = " + index);
        System.out.println("Значение минимального элемента массива = " + min);
    }
}
