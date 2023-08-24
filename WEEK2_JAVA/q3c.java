// 3) write a program that creates and prints a random phone number of the form 
// XXX-XXX-XXXX. include the dashes in the output . Do not let the first three digits 
// contain an 8 or 9 (but don't be more restrictive than that), and make sure that the 
// second set of three digits is not greater than 655. Hint : think through the easiest
//  way to construct the phone number . Each digit does not have to be determined separately.

import java.util.*;

public class q3c{

   static class PhoneNumber{
        int f3;//first three digits
        int n3;//next 3 digits
        int l4;//last 4 digits
   }
   
   private static int generateValidThreeDigits(){
     int n3;
     do{
       n3=new Random().nextInt(1000);
     }while(n3>=800 && n3<=999);
     return n3;
   }
   
   public static void main(String[] args){
     PhoneNumber phoneNumber= new PhoneNumber();
     phoneNumber.f3=generateValidThreeDigits();
     phoneNumber.n3= new Random().nextInt(656)+100;
     phoneNumber.l4=new Random().nextInt(10000)+1000;
     System.out.println("Phone Number is\n"+phoneNumber.f3+'-'+phoneNumber.n3+'-'+phoneNumber.l4+"\n");
   }
}
