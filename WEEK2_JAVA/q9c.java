//write a program that generates a random integer base (b),height (h) and a side (a) for a
//parallelogram in the range 10 to 30, inclusive and then computes the area and perimeter of the
//parallelogram .
//Area = base * height
//Perimeter = 2*(a+b)

import java.util.*;

public class q9c{
  static class Generate{
    Random random= new Random();
    int b;
    int h;
    int a;
    int area;
    int perimeter;
    int minvalue=10;
    int maxvalue=30;
    
    //COnstructor
    public Generate(){
    b=random.nextInt(maxvalue-minvalue+1)+minvalue;
    h=random.nextInt(maxvalue-minvalue+1)+minvalue;
    a=random.nextInt(maxvalue-minvalue+1)+minvalue;
    area=b*h;
   perimeter=2*(a+b);
    }
    
   
  }
  
  public static void main(String args[]){
    Generate p1=new Generate();

   //Area and Perimeter of the object
   System.out.println("The area of the object is\t"+p1.area+"\n");
   System.out.println("The perimeter of the object is\t"+p1.perimeter+"\n"); 
  }
  
}
