package com.company;

import java.util.Random;

public class Main {

    private final static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int arr[] = new int[ARRAY_SIZE];
        Random random = new Random();
        int sum = 0;
        int min = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            System.out.printf("%d ", arr[i]);
            sum = sum + arr[i];
            if(arr[i] < min || min == 0){
                min = arr[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Сумма всех элементов в массиве = " + sum);
        System.out.println("Индекс минимального элемента массива = " + index);
        System.out.println("Значение минимального элемента массива = " + min);
    }
}
