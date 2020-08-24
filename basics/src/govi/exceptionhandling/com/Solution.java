package govi.exceptionhandling.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	
    	   Scanner scan = new Scanner(System.in);
           try {
               int x = scan.nextInt();
               int y = scan.nextInt();
        	   System.out.println(x/y);
           }
           catch(InputMismatchException | ArithmeticException e) {
        	   if(e instanceof InputMismatchException) {
        		   System.out.println(e.getClass().getName());
        	   }
        	   else {
               	   System.out.println(e);
        	   }
           }
           catch(Exception e) {
        	   System.out.println(e);
           }
           finally {
        	   scan.close();
           }
    	
    }
}