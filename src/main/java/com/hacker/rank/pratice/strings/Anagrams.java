package com.hacker.rank.pratice.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagrams {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        String s1 = scan.nextLine();
       
        String updateds= Arrays.stream(s.toLowerCase().split("")).sorted().collect(Collectors.joining());
        String updateds1= Arrays.stream(s1.toLowerCase().split("")).sorted().collect(Collectors.joining());
        
        if(updateds.equals(updateds1)) {
        	System.out.println("Anagrams");
        }

	}

}
