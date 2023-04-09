//        Задание 2*.
//        Реализовать приложение, рассчитывающее определенный интеграл методом Симпсона.
//        Под знаком суммы показан шаг цикла, равный двум.
//        Рассмотреть случаи для разных разбиений.


import java.util.Scanner;

class Program {
    public static double f(double x) {
        return (10 - x);
    }

    public static double simpsonIntegral(double a, double b, double n) {
        double h = (b - a) / n;
        double k1 = 0, k2 = 0;

        for (int i = 1; i < n; i += 2) {
            k1 = f(a + i*h);
            k2 = f(a + (i + 1)*h);
        }

        return (h/3)*(f(a) + f(b) + 4*k1 + 2*k2);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите левую границу интегрирования a = ");
        double a = scanner.nextInt();
        System.out.println("Введите правую границу интегрирования b = ");
        double b = scanner.nextInt();
        System.out.println("Введите значение погрешности N = ");
        double n = scanner.nextInt();

        System.out.println("Результат расчета интеграла методом Симпсона: " + simpsonIntegral(a, b, n));
    }
}