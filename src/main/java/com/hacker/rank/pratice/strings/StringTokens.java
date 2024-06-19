package com.hacker.rank.pratice.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
       
//        String[] tokens = s.split("[\\s+,'?]");
//        System.out.println(tokens.length);
//        for(String s1 : tokens) {
//        	System.out.println(s1.trim());
//        }
        
        List<String> lines = Arrays.stream(s.split("[\\s+,'?]"))
                .map(x -> x.trim())
                .filter(x -> x.length() > 0)
                .collect(Collectors.toList());
        System.out.println(lines.size());
        for (String line : lines) {
            System.out.println(line);
        }

	}

}
