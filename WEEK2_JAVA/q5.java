// 5) write a program that reads the (x,y) coordinates for two points which form
//  a straight line.compute the slope of the line using the following formula
// slope (m) = (y2-y1)/(X2-X1)

import java.util.*;
public class q5 {
    static class newClass{
        double x1,x2,y1,y2;
        double slope(double x1,double x2,double y1,double y2){
            double ans=(y2-y1)/(x2-x1);
            return ans;
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        newClass data=new newClass();
        System.out.println("Enter x1,x2 y1,y2 : ");
        data.x1=inp.nextInt();
        data.x2=inp.nextInt();
        data.y1=inp.nextInt();
        data.y2=inp.nextInt();

        double slope=data.slope(data.x1,data.x2,data.y1,data.y2);
        System.out.printf("Slope is %.6f",slope);
    }
}
