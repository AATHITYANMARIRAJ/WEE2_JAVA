// 7) write a program that reads the two sides and the height of a trapezoid from the user .
//  Compute the area of the trapezoid using the formula given below , in which b represents 
//  the vertical length of the trapezoid and a and b represent the two sides of a trapezoid.
//  Print the area to two decimal places.

// Area = ((a+b)/2)*b

import java.util.*;

public class q7c{

  static class Set{
        int s1;
        int s2;
        int height;
  }
  
  public static void main(String args[]){
     Set s=new Set();
     Scanner inp1=new Scanner(System.in);
     System.out.println("Enter the length of first side\n");
     s.s1=inp1.nextInt();
     System.out.println("Enter the length of second side\n");
     s.s2=inp1.nextInt();
     System.out.println("Enter the height\n");
     s.height=inp1.nextInt();
     
     int area=((s.s1*s.s2)/2)*s.s2;
     System.out.println("The area of trapezoid is\t"+area);
  }

}

