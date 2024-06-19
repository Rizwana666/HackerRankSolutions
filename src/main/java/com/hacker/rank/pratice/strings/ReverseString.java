package com.hacker.rank.pratice.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        String reverse = new StringBuilder(s).reverse().toString();
        
        if(reverse.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}

}
