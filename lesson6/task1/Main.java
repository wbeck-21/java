//        В классе RemoteController предусмотреть метод, который позволит по номеру канала
//        “показать” СЛУЧАЙНУЮ программу этого канала.
//        Инициализацию всех объектов и демонстрацию работоспособности программы
//        продемонстрировать в main-методе.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        TV tv = new TV();

        if (tv.isTurnOn == false) {
            System.out.println("Телевизор выключен");
            controller.turnOnTv(tv);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер канала:");
        int channal = scanner.nextInt();

        if (channal > 0) {
            controller.turnRandomProgram(channal);
        } else {
            System.out.println("Номер канала может быть только положительным");
        }
    }
}