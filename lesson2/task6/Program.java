//З       адание 6 *.
//        Реализовать приложение, которое выполняет преобразование массива в число.


import java.util.Scanner;

class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int array[];
        int number = 0;

        System.out.println("Введите количество чисел массива, которое нужно преобразовать в число:");
        int arrayLength = scanner.nextInt();

        System.out.println("Введите числа массива, которое нужно преобразовать в число:");
        for (int i = arrayLength; i > 0; i--) {
            int num = scanner.nextInt();
            for (int j = 1; j < i; j++) {
                num *= 10;
            }
            number += num;
        }

        System.out.println("Ваше число: " + number);
    }
}