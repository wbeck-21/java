//        Задание 1 *.
//        Реализовать Фибоначчи с однократным вызовом рекурсии.
//              ● Без f(n-1) + f(n-2)

import java.util.Scanner;

class Program {
    public static int fib(int n, int k, int a, int b) {
        if (k == n) {
            return b;
        }
        return fib(n, k + 1, b, a + b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n:");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("0");
            return;
        }
        System.out.println(fib(n, 1, 0, 1));
    }
}
