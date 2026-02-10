package training;

public class Arraysecondmax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int first = -9999;
        int second = 0;

        for (int i = 0; i < arr.length;i++){
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}