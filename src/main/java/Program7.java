//import stuff here
import java.util.Scanner;
//Your code here
public class Program7
{
   public static void main(String[] args){
    
       Scanner myScanner=new Scanner(System.in);
       double schBucks=0.0;
       double klevins=0.0;
       double stanN= 0.0;
       double decimalSB=0.0;
       
       System.out.println("Enter schrute-bucks: ");
       schBucks=myScanner.nextDouble();
       
       System.out.println("Enter klevins: ");
       klevins= myScanner.nextDouble();
       
       System.out.println("Enter stanley-nickels: ");
       stanN=myScanner.nextDouble();
       
       klevins=klevins/20.0;
       stanN=stanN/240;
       decimalSB=(schBucks+klevins+stanN)+0.005;
       
       decimalSB=(int)(decimalSB*100);
       decimalSB=(double)(decimalSB/100);
       System.out.print("decimal schrute-bucks: "+ decimalSB);
       
   }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
decimal schrute-bucks: 7.89

*/
