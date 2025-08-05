public class Binary {

    public static int BinarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            // comparation
            if (number[middle] == key) {
                return middle;
            }
            if (number[middle] < key) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 142;

        // System.out.println("index for key is : " + BinarySearch(arr, key));

        int index = BinarySearch(arr, key);

        if (index == -1) {
            System.out.println("not found");
        }
        System.out.println("index for key is : " + index);

    }
}
