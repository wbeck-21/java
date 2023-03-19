//        Реализовать приложение, которое выводит сумму цифр пятизначного числа (значение числа
//        задается непосредственно в коде).
//
//              ● В данном задании запрещено использование циклов и массивов.


class Program {
    public static void main(String args[]) {
        int number = 12345;
        int digitsSum =
                number / 10000 +        // number[0] - 1
                number / 1000 % 10 +    // number[1] - 2
                number / 100 % 10 +     // number[2] - 3
                number / 10 % 10 +      // number[3] - 4
                number % 10;            // number[4] - 5

        System.out.println(digitsSum);
    }
}
