//        Задание 1.
//        Реализовать приложение, которое выводит сумму элементов массива (массив вводится с
//        клавиатуры).

//        Что является точкой выхода?
//        Какой размер массива?
//        Я тут просто забью на слово массив...


import java.util.Scanner;

class Program {
    public static void main(String args[]) {
        System.out.println("Введите числа, последнее число последовательности - 0");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arraySum = 0;
        int array[] = new int[n];

        while (n != 0) {
            arraySum += n;
            System.out.println("Сумма элементов: " + arraySum);
            n = scanner.nextInt();
        }
        System.out.println("Итоговая сумма элементов: " + arraySum);
    }
}