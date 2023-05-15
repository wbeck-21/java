public class Bus {
    private int number;
    private Driver driver;

    private Passenger passengers[];
    private int countPassenegers;
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Не допустимое значение номера автобуса. По умолчанию 1");
            this.number = 1;
        }
    }

    public Bus(int number){
        this.number = number;
        this.passengers = new Passenger[10];
    }

    public void takePassenger(Passenger passenger) {
        this.passengers[countPassenegers] = passenger;
        this.countPassenegers++;
    }

    public void takeDriver(Driver driver) {
        this.driver = driver;
    }

    public void go() {
        System.out.println("Автобус " + this.number + " поехал!");
        for (int i = 0; i < countPassenegers; i++) {
            System.out.println("Пассажир " + passengers[i].getFirstName() + " поехал!");
        }
    }
}