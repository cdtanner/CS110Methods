/**
 * @(#)Circle2.java
 * @CS 110 Sample Program 
 * @9-14-08
 * @Determines the circumference and area of a circle
 * @Introduction to user-defined methods
 */

import java.util.Scanner;

public class Circle2 
{
 static final double PI = 3.14159;
 static Scanner sc = new Scanner(System.in);

 public static void main (String[] args) 
 {
  double area, circum, radius;
   
  radius = getRadius();
  area = calcArea(radius);
  circum = calcCircum(radius);
  displayResult(radius, area, circum);
 }
 
 //Get the radius of the circle
 public static double getRadius()
 {
     double radius;
     System.out.println();
     System.out.println
         ("Enter the radius of the circle: ");
     radius = sc.nextDouble();
     return radius;
 }  

 //Calculate the area of the circle
 public static double calcArea(double radius)
 {
     double area;
     area = PI * radius * radius;
     return area; 
 }
 
 //Calculate the circumference of the circle
 public static double calcCircum(double radius)
 {
     double circum;
     circum = 2.0 * PI * radius;
     return circum; 
 }

 //Displays the radius, area and the circumference
 public static void displayResult(double radius, double area, double circum)
 {
  System.out.println();
  System.out.println
   ("The circumference of a circel whose radius is " 
           + radius + " is " + circum);
  System.out.println();
  System.out.println
   ("The area of a circel whose radius is " + radius 
         + " is " + area);   
 } 
}