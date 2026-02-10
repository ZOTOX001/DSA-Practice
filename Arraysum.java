package training;

public class Arraysum {
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr){
            total += num;
        }
        return total;
    }

    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6};
        System System = null;
        System.out.println("sum:" + sum(arr));
    }
}