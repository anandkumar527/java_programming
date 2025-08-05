//print 1 to 10 using while loop
package Loops;

import java.util.*;

public class printnumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the num:");
        int range = Sc.nextInt();

        int counter = 0;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;

        }

    }

}
