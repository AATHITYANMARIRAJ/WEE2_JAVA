// 6)  write a program that reads the radius of a sphere and 
// prints its volume and surface area . use the following formulas 
// . Print the output to four decimal places . r represents the raius.

// Volume = 4/3 * pi * r^3

// surface area =  4*pi *r^2

import java.util.*;

public class q6 {
    static class newClass{
        int r;
        double pi=Math.PI;
        double volume(int r){
            double vol = Double.valueOf(4)/Double.valueOf(3)*pi*Math.pow(r,3);
            return vol;
        }
        double area(int r){
            double area=Double.valueOf(4)*pi*Math.pow(r,2);
            return area;
        }
    }


    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        newClass data= new newClass();
        data.r=inp.nextInt();
        double volume=data.volume(data.r);
        double area=data.area(data.r);
       System.out.printf("Volume of sphere is: %.4f\n",volume);
       System.out.printf("Surface area is  : %.4f\n",area);

        
    }
}
