/**
 * @(#)Volume.java
 * @CS 110 Sample Program 
 * @9-27-08
 * @Determines the volume of a right circular cylinder
 */

import java.util.Scanner;
import java.lang.Math;

public class Volume 
{

 
 public static void main (String[] args) 
 {
  double radius, height, volume;
    
  Scanner sc = new Scanner(System.in);
  
  System.out.println
   ("Enter the radius of the cylinder in feet: ");
  radius = sc.nextDouble();
  System.out.println
   ("Enter the height of the cylinder in feet: ");
  height = sc.nextDouble();
  
  volume = height * calcArea(2.0 * radius);
  
  System.out.println();
  System.out.println();
  System.out.println
   ("The volume of the cylinder is " + volume +
     " square feet.");  
 }
    
 public static double calcArea(double diam)
 {
     double area;
     area = Math.PI * (diam / 2.0) * (diam / 2.0);
     return area;
 }    
}