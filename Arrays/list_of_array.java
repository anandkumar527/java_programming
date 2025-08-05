/*----find the key element in arrays----- */
public class list_of_array {

    // linear search method
    public static int linearsearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 10, 14, 16, 18, 20 };
        int key = 120;

        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        }
        System.out.println("key is at index : " + index);
    }
}
