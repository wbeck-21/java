//Задание 2.
//        Реализовать метод бинарного поиска с помощью рекурсии.


class Program {
    public static int binarySearch(int array[], int left, int right, int element) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == element) {
            return mid;
        }
        else if (array[mid] > element) {
            return binarySearch(array, left, mid - 1, element);
        }
        else {
            return binarySearch(array, mid + 1, right, element);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 6, 8, 9, 10 };
        int element = 10;

        int index = binarySearch(arr, 0, arr.length - 1, element);
        if (index != -1) {
            System.out.println("Найден элемент под индексом " + index);
        }
        else {
            System.out.println("Элемент не найден в массиве");
        }
    }
}