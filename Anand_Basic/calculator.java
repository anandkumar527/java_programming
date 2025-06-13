import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

     //input two number

        System.out.print("enter the num1:");
        int a =sc.nextInt();

        System.out.print("enter the num2:");
        int b =sc.nextInt();

       // System.out.print("enter the num3:");
        //int c =sc.nextInt();
        
        System.out.print("chose operator:");
        char operator = sc.next().charAt(0);
    
     // Perform operation using switch
     
        switch (operator) {
            case '+':System.out.println("Result = " + (a+b));
                break;
            case '-':System.out.println("Result = " + (a-b));
                break;
            case '*':System.out.println("Result = " + (a*b));
                break;
            case '/':System.out.println("Result = " + (a/b));
                break;
            case '%':System.out.println("Result = " + (a%b));
            default:
                System.out.println("Invalid operator. Please use +, -, *, /,%");
        }

    }
}
