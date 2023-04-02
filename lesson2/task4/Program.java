//        Задание 4.
//        Реализовать приложение, которое меняет местами максимальный и минимальный элементы
//        массива (массив вводится с клавиатуры).

//        Не понимаю, что понимается по макс и мин элементами, их индексы или значения
//        Думаю, что тут имеют ввиду именно значения


import java.util.Scanner;
import java.util.Arrays;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printSmth("Введите длину массива:");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        int num;
        int indexOfMaxNum = 0;
        int indexOfMinNum = 0;

        printSmth("Введите числа массива:");
        for (int i = 0; i < arrayLength; i++) {
            // добавление элементов в массив
            num = scanner.nextInt();
            array[i] = num;

            // поиск макс и мин значений и их индексов
            if (array[i] > array[indexOfMaxNum])
            {
                indexOfMaxNum = i;
            }
            else if (array[i] < array[indexOfMinNum])
            {
                indexOfMinNum = i;
            }
        }

        swap(array, indexOfMinNum, indexOfMaxNum);

        System.out.println("Результат: " + Arrays.toString(array));
    }

    public static void printSmth(String str) {
        System.out.println(str);
    }

    public static void swap(int array[], int indexOfMinNum, int indexOfMaxNum) {
        int temp = array[indexOfMinNum];
        array[indexOfMinNum] = array[indexOfMaxNum];
        array[indexOfMaxNum] = temp;
    }
}