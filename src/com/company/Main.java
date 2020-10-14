package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[10];
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
