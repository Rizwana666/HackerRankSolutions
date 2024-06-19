package com.hacker.rank.pratice.strings;

import java.util.Scanner;

public class StringProblem1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        
	        System.out.println((A.length())+(B.length()));
	        
	        int result = A.compareTo(B);
	     
	        
	        if(result > 0){
	            System.out.println("Yes");
	        }else if(result <0){
	            System.out.println("No");
	        }else if(result == 0){
	            System.out.println("No");
	        }
	        
	        System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1))+ " "+B.substring(0, 1).toUpperCase().concat(B.substring(1)));
	        

	}

}
