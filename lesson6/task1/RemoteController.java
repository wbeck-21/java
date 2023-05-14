
class RemoteController {
    void turnOffTv(TV tv) {
        tv.isTurnOn = false;
    }
    void turnOnTv(TV tv) {
        tv.isTurnOn = true;
    }
    void turnRandomProgram(int channal) {
        int program = (int) (Math.random() * 11);
        System.out.println("Включена программа " + program + " канала " + channal);
    }
}