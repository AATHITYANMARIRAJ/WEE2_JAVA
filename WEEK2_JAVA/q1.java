// 1) write a program that prompts for and reads the users city and country separately 
// then print a string composed of the first letters of the users country followed by a 
// comma and then folowed by user city  ad followed by random number 1 t0 100 which represent 
// which represent the pincode of the city

import java.util.*;   


public class q1{
  static class Input{
        String city;
        String con;
}
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        //OBJECT 
        Input get=new Input();
        System.out.println("Enter city : ");
        get.city=inp.nextLine();
        System.out.println("Enter Your country : ");
        get.con=inp.nextLine();
        int randomNum = Math.round((int)(Math.random()*100));

        //printn the output
        System.out.print("Country : "+get.con.charAt(0)+get.con.charAt(1)+" , ");
        System.out.print("City : "+get.city+" , ");
        System.out.println("Pincode : "+randomNum);
    }
}