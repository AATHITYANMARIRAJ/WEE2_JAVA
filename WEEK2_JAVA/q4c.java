// 4) Write a program that reads an integer values and prints the values
//  raised to the power of that number. for example if the number is 2, the
//   program would print 7.389056 (where e=2.71828).

import java.util.*;

class q4c{
   static class Getnumber{
      int n;
   }
  
  public static void main(String args[]){
     Getnumber number=new Getnumber();
     double e=2.71828;
     Scanner inp1=new Scanner(System.in);
     System.out.println("enter the number\n");
     number.n=inp1.nextInt();
     
     double ans=Math.pow(e,number.n);
     System.out.println("The answer is\t"+ans);
  
  }
}
