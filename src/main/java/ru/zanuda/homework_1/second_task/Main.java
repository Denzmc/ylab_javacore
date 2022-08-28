package ru.zanuda.homework_1.second_task;

public class Main {
    public static void main(String[] args) {
        int array[] = {5,6,3,2,5,1,4,9};
        int v = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]){
                    v = array[i];
                    array[i] = array[j];
                    array[j] = v;
                }
            }
            System.out.print(array[i] + " ");
        }

    }
}
