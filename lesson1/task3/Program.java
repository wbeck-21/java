//        Реализовать приложение, которое для заданной последовательности чисел считает
//        произведение тех чисел, сумма цифр которых - простое число. .
//              Пример входных данных:
//                  119 (сумма цифр - 11, простое число)
//                  33542 (сумма цифр - 17, простое число)
//                  99 (сумма цифр - 18, составное число)
//                  0 (последнее число последовательности)
//                  Ответ: 119 * 33542 = 3991498


import java.util.Scanner;

class Program {
    static int res = 1;
    public static void main(String[] args) {
        System.out.println("Введите числа, последнее число последовательности - 0");
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Ответ: " + res);
                break;
            }
            else if (isPrime(sumDigits(num))) {
              res *= num;
            }
        }
    }
    // Подсчет суммы цифр числа
    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    // Проверка на простое число
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
