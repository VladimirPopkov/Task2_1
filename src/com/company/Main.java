package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr [] = new int[10];
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            System.out.printf("%d ", arr[i]);
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Сумма всех элементов в массиве = " + sum);
    }
}
