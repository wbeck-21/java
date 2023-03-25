//        Задание 5 *.
//        Реализовать приложение, которое выполняет сортировку массива методом пузырька.


import java.util.Scanner;
import java.util.Arrays;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые нужно отсортировать:");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        int num;
        boolean isSorted = false;

        System.out.println("Введите сами числа, которые нужно отсортировать:");
        for (int i = 0; i < arrayLength; i++) {
            num = scanner.nextInt();
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));

        int temp;
        while (!isSorted) {
            isSorted = true;
             for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
             }
        }
        System.out.println(Arrays.toString(array));
    }
}