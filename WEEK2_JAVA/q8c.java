// 8) write a program that generates two random integers in the range 1 to 20 , 
// incluesive and displays the sine and cosine of the sum of those two integers.

import java.util.Random;

public class q8 {

    static class Get {
        int a;
        int b;
    }

    public static void main(String args[]) {
        Get g = new Get();
        g.a = new Random().nextInt(20) + 1;
        g.b = new Random().nextInt(20) + 1;

        double sum = Double.valueOf(g.a) + Double.valueOf(g.b);
        double sinvalue = Math.sin(sum);
        double cosvalue = Math.cos(sum);

        System.out.println("The sine of the sum is\t" + sinvalue + "\n");
        System.out.println("The cos of the sum is\t" + cosvalue + "\n");
    }
}

