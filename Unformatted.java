/*
*Unformatted.java
*@author Yotsaphon Sutweha
*03/02/2017
*/

import java.util.Scanner;
public class Unformatted
{
public static void main(String args[])
{
Scanner keyboard;
keyboard = new Scanner(System.in);
final double X = 13.45; final int Y=34;
double salary;int num;
	System.out.println("enter an integer less than 70:");
num = keyboard.nextInt();
salary=num*X;
System.out.println("Wages: "+salary);System.out.println("X = "+X);
System.out.println("X + Y = "+(X+Y));
}}