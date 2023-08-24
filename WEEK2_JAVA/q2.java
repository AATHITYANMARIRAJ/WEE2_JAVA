//2) write a program that prints square of the product prompt for and 
// read three integer values and print the square of the product of all the
//  three integers
import java.util.*;

public class q2 {
    static class numbers{
        int a;
        int b;
        int c;
        int product;
        int multiply(int a,int b,int c){
            return a*b*c;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter three integers : ");
        Scanner inp=new Scanner(System.in);
        numbers data=new numbers();
        data.a=inp.nextInt();
        data.b=inp.nextInt();
        data.c=inp.nextInt();
        System.out.println("Square of a : "+data.a*data.a);
        System.out.println("Square of b : "+data.b*data.b);
        System.out.println("Square of c : "+data.c*data.c);
        int product=data.multiply(data.a, data.b, data.c);
        System.out.println("Prouct of a b c : "+product);
        System.out.println("square of product : "+product*product);

    }
}
