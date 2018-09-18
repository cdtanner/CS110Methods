/**
 * @(#)Exponent.java
 * @CS 110 Sample Program 
 * @9-27-08
 * @Determine a floating point number raised to 
 * @ a floating point power without using Math.pow
 */

import java.util.Scanner;

public class Exponent 
{
 public static void main (String[] args) 
 {
  double a, b;
  double c = 0.0;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println
   ("Enter the number to be raised to a power ");
  a = sc.nextDouble();
  System.out.println
   ("Enter the exponent (as a decimal) ");
  b = sc.nextDouble();
  c = power(a, b);
  
  System.out.println
   (a + " raised to the " + b + " power equals " + c);
  System.out.println();
  System.out.println("OK");
 }    
     
 public static double power(double x, double y)
 {

     double temp,z;
     temp = y * Math.log(x);
     z = Math.exp(temp);
     return z;
 }    
}
