//        Задание 1.
//        Реализовать приложение, со следующим набором функций и процедур:
//        ● выводит сумму элементов массива +
//        ● выполняет разворот массива (массив вводится с клавиатуры). +
//        ● вычисляет среднее арифметическое элементов массива (массив вводится с
//        клавиатуры). +
//        ● меняет местами максимальный и минимальный элементы массива +
//        ● выполняет сортировку массива методом пузырька. +
//        ● выполняет преобразование массива в число.


import java.util.Scanner;
import java.util.Arrays;

class Program {

    public static int sum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] reverse(int arr[]) {
        int reverseArr[] = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j += 1;
        }
        return reverseArr;
    }

    public static int mean(int arr[]) {
        return sum(arr) / arr.length;
    }

    public static int[] swapMinMax(int arr[]) {
        int indexOfMaxNum = 0;
        int indexOfMinNum = 0;
        int arrSwapMinMax[] = arr.clone();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[indexOfMaxNum]) {
                indexOfMaxNum = i;
            }
            if (arr[i] < arr[indexOfMinNum]) {
                indexOfMinNum = i;
            }
        }

        int temp = arrSwapMinMax[indexOfMaxNum];
        arrSwapMinMax[indexOfMaxNum] = arrSwapMinMax[indexOfMinNum];
        arrSwapMinMax[indexOfMinNum] = temp;

        return arrSwapMinMax;
    }

    public static int[] bubbleSort(int arr[]) {
        int bubbleSortArr[] = arr.clone();
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < bubbleSortArr.length - 1; i++) {
                if (bubbleSortArr[i] > bubbleSortArr[i + 1]) {
                    isSorted = false;

                    int temp = bubbleSortArr[i];
                    bubbleSortArr[i] = bubbleSortArr[i + 1];
                    bubbleSortArr[i + 1] = temp;
                }
            }
        }
        return bubbleSortArr;
    }

    public static int arrToInt(int arr[]) {
        int tempArr[] = arr.clone();
        int number = 0;
        int k = 0;

        for (int i = tempArr.length - 1; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                tempArr[k] *= 10;
                k += 1;
            }
            number += tempArr[k];
        }
        return number;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        System.out.println("Введите числа массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nМассив: " + Arrays.toString(arr));
        System.out.println("\nСумма элементов массива: " + sum(arr));
        System.out.println("Перевернутый массив: " + Arrays.toString(reverse(arr)));
        System.out.println("Среднее арифметическое элементов массива: " + mean(arr));
        System.out.println("Массив, где макс и мин элементы переставлены местами: " + Arrays.toString(swapMinMax(arr)));
        System.out.println("Отсортированный массив: " + Arrays.toString(bubbleSort(arr)));
        System.out.println("Преобразование массива в число: " + arrToInt(arr));
        System.out.println("\nМассив: " + Arrays.toString(arr));

    }
}