package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int sum = 0;
        int array[] =generateRandomArray();
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }
        {
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
    }

    public static void task2() {

        int maxSum = 0;
        int minSum = 200_000;
        int array[] =generateRandomArray();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > maxSum) {
                maxSum = array[i];
            }
            if (array[i] < minSum) {
                minSum = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    public static void task3() {
        int sum = 0;
        double average = 0;
        int array[] =generateRandomArray();
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }
        average = sum / 30;
        {
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        }

    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}