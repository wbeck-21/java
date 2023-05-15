class Main{
    public static void main(String[] args){
        Driver driver = new Driver("Семен", "Тихий");
        Bus bus = new Bus(844);
        Passenger p1 = new Passenger("Василий", "Ананасов");
        Passenger p2 = new Passenger("Екатерина", "Веселова");
        Passenger p3 = new Passenger("Иван", "Селедкин");
        Passenger p4 = new Passenger("Людмила", "Лопухина");

        p1.goToBus(bus);
        p2.goToBus(bus);
        p3.goToBus(bus);
        p4.goToBus(bus);

        driver.goToBus(bus);

        bus.go();
    }
}