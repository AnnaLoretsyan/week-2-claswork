package Week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double p = 3.14159;
        Scanner scanner= new Scanner(System.in);
        double r= scanner.nextDouble();
        double l= 2*p*r;
        double s= p*r*r;
        System.out.println(l);
        System.out.println(s);


    }
}
