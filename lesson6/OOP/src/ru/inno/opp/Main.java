class Main {
    public static void main(String[] args){
        Human anastasia = new Human();
        anastasia.work();
        anastasia.relax();
        anastasia.height = 160;
        anastasia.grow(2);

        System.out.println(anastasia.isWorker);
        System.out.println(anastasia.height);

    }
}