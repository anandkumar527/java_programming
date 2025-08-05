/*---------------marks updat--------------- */
public class array01 {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 20, 30, 40, 50 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
