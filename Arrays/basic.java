import java.util.*;

public class basic {
    public static void main(String[] args) {
        int marks[]=new int[50];

        Scanner Sc = new Scanner(System.in);

        marks[0]=Sc.nextInt();
        marks[1]=Sc.nextInt();
        marks[2]=Sc.nextInt();
        marks[3]=Sc.nextInt();
        marks[4]=Sc.nextInt();

        System.out.println("phy :" + marks[0]);
        System.out.println("eng :" + marks[1]);
        System.out.println("math :" + marks[2]);
        System.out.println("hindi :" + marks[3]);
        System.out.println("gk :" + marks[4]);
    }
}
