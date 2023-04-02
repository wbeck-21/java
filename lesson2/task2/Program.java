//        Задание 2.
//        Реализовать приложение, которое выполняет разворот массива (массив вводится с
//        клавиатуры).

//        Что является точкой выхода?
//        Какой размер массива?

//        Допустим длину массива выбирает сам пользователь


import java.util.Scanner;
import java.util.Arrays;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        int num;

        System.out.println("Введите числа массива:");
        for (int i = arrayLength - 1; i >= 0; i--) {
            num = scanner.nextInt();
            array[i] = num;
        }

        System.out.println(Arrays.toString(array));
    }
}