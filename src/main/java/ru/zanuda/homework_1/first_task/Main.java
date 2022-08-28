package ru.zanuda.homework_1.first_task;

public class Main {
    public static void main(String[] args) {
        int array [][] = new int[5][5];

        // создаем двумерный массив целых чисел в интервале [-1000;1000)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (2000 *Math.random() - 1000);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        maxArr(array);
        minArr(array);
        avgArr(array);

    }
    //метод поиска максимального значения двумерного массива
    static void maxArr(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    //метод поиска минимального значения двумерного массива
    static void minArr(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
    //метод поиска среднего значения двумерного массива
    static void avgArr(int[][] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        double avg = (double) sum / (double) count;
        System.out.println(avg);
    }
}
