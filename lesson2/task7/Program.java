//        Задание 7 *.
//        Реализовать приложение, которое заполняет двумерный массив M*N последовательностью
//        чисел “по спирали”.
//        Например, для массива 3 на 3:
//        1 2 3
//        8 9 4
//        7 6 5


import java.util.Scanner;
import java.util.Arrays;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во строк:");
        int rows = scanner.nextInt();
        int maxRows = rows - 1;
        int minRows = 0;

        System.out.println("Введите кол-во столбцов:");
        int cols = scanner.nextInt();
        int maxCols = cols - 1;
        int minCols = 0;

        int arr[][] = new int[rows][cols];
        int max = cols * rows;
        int num = 1;

        while (num <= max) {
            for (int i = minCols; i <= maxCols && num <= max; i++) {
                arr[minRows][i] = num;
                num += 1;
            }
            minRows += 1;
            for (int i = minRows; i <= maxRows && num <= max; i++) {
                arr[i][maxCols] = num;
                num += 1;
            }
            maxCols -= 1;
            for (int i = maxCols; i >= minCols && num <= max; i--) {
                arr[maxRows][i] = num;
                num += 1;
            }
            maxRows -= 1;
            for (int i = maxRows; i >= minRows && num <= max; i--) {
                arr[i][minCols] = num;
                num += 1;
            }
            minCols += 1;
        }
        System.out.println("\nРезультат:");
        for (int i = 0; i < cols; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}