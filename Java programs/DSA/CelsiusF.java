package DSA;
import java.util.Scanner;
public class CelsiusF {
    public static void main(String args[])
      {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Choice:");
         int ch = sc.nextInt();
         switch(ch)
         {
           case 1:System.out.println("Enter temperature in Fahrenheit:");
                float F = sc.nextFloat();
                float C = ((5/9.0f)*(F-32));
                System.out.println("Temperature in Centigrade degrees:"+C);
                 break;
           case 2:System.out.println("Enter temperature in Celsius:");
                 float c = sc.nextFloat();    
                 float f = ((c - 32)*5)/9;
                 System.out.println("Temperature in Fahrenheit degrees:"+f);
                 break;
                 default:System.out.println("Invalid Input");
                 break;
       }
      }
    }

