import java.util.*;
public class taxcalaulator {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enete tha tax=");
    int income=Sc.nextInt();
    int tax;

    if (income<500000) {
           tax=0;
    }
    else if (income>=5000000 && income<=10000000) {
           tax=(int)(income*0.2);
    }
    else{
           tax=(int)(income*0.5);
    }
    System.out.println("your tax is="+tax);
    }
}
  