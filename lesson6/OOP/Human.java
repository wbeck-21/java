public class Human {
    // инкапсуляция заключается в том, что:
    // 1) в одну сущность запихиваются алгоритмы и структуры данных
    // 2)
    boolean isWorker;
    double  height;

    void grow(double value){
        height += value;
    }
    void relax(){
        isWorker = false;
    }
    void work(){
        isWorker = true;
    }
}