//        Задание 3.
//        Реализовать приложение, которое вычисляет среднее арифметическое элементов массива
//        (массив вводится с клавиатуры).

//        Допустим длину массива выбирает сам пользователь
//        Зачем вообще нам массив... Но для задания сделаю

import java.util.Scanner;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        int arraySum = 0;
        int num;

        System.out.println("Введите числа массива:");
        // Заполнение массива
        for (int i = 0; i < arrayLength; i++) {
            num = scanner.nextInt();
            array[i] = num;
        }

        // Подсчет суммы значений элементов массива
        for (int i = 0; i < arrayLength; i++) {
            arraySum += array[i];
        }

        // Расчет среднего арифметического
        int arrayAverage = arraySum / arrayLength;

        System.out.println("Среднее арифметическое элеметов массива: " + arrayAverage);
    }
}