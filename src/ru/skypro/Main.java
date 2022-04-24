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
        int[] random = {120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000};
        for (int i = 0; i < random.length - 1; i++) {
            sum += random[i];
        }
        {
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
    }

    public static void task2() {
        int maxSum = 0;
        int minSum = 200_000;
        int[] random = {120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000};
        for (int i = 0; i < random.length - 1; i++) {
            if (random[i] > maxSum) {
                maxSum = random[i];
            }
            if (random[i] < minSum) {
                minSum = random[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    public static void task3() {
        int sum = 0;
        double average = 0;
        int[] random = {120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 120_000, 140_000, 160_000, 150_000, 110_000, 100_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000, 125_000, 145_000, 165_000, 155_000, 115_000, 105_000};
        for (int i = 0; i < random.length - 1; i++) {
            sum += random[i];
        }
        average = sum / 30;
        {
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        }
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}