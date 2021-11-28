package Week2;

import java.util.Random;
import java.util.RandomAccess;

public class Task4 {
    public static void main(String[] args) {
        Random random= new Random();
        int i = random.nextInt();
        int x=i%6+2;
        if(x<0)
        {
            x = -x;

            System.out.println(x);
        }


    }
}
