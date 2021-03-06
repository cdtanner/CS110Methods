/**
 * @(#)Pyth2.java
 * @CS 110 Sample Program 
 * @9-14-08
 * @Generates pythagorean triples and demonstrates methods
 */

import java.util.Scanner;

public class Pyth2 
{
 static Scanner sc = new Scanner(System.in);

 public static void main (String[] args) 
 {
  int side1 = 0, side2 = 0, side3 = 0;
  int seed1, seed2;

  welcomeMess();
  seed1 = inputValue("Smaller");
  seed2 = inputValue("Larger");  

  side1 = seed2 * seed2 - seed1 * seed1;
  side2 = 2 * seed1 * seed2;
  side3 = seed2 * seed2 + seed1 * seed1;

  displayResult(side1, side2, side3, seed1,seed2);
 }
 
 //Displays a Welcome message
 public static void welcomeMess()
 {
  System.out.println
   ("Welcome to Generating Pythagorean Triples");
  System.out.println
   ("This program requires two seed values, to");
  System.out.println
   ("generate the triples.");
 }
 
 //Input the seed value
 public static int inputValue(String size) 
 {
     int seed;

     System.out.println();
     System.out.println
         ("Enter the " + size + " of the seed value");
     seed = sc.nextInt();
     return seed;  
 }
 

 
 //Output the results
 public static void displayResult(int side1, int side2,int side3, int seed1,int seed2)
 {
     System.out.println();
     System.out.println();
     System.out.println("The triple generated by " + seed1 + ", " + seed2 + " is ");
     System.out.println();
     System.out.println(side1 + ", " + side2 + ", " + side3);
 }    
}