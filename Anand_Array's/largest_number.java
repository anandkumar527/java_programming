import java.util.*;

public class largest_number {

    public static int getnumbers(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 6, 7, 9, 21, 6, 4 };
        System.out.println("largest value is : " + getnumbers(numbers));
    }
}
