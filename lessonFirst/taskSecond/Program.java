//        Реализовать приложение, которое выводит двоичное представление пятизначного числа
//        (значение числа задается непосредственно в коде).
//
//        ● В данном задании запрещено использование циклов и массивов.


class Program {
    public static void main(String[] args) {
        int number = 12345;
        String binaryNumber = Integer.toBinaryString(number);

        System.out.println(binaryNumber);
    }
}
