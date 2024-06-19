package com.hacker.rank.pratice.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalSubStringSmallestGreatest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        
        List<String> substrings = new ArrayList<>();
        
         // Generate all substrings of length k
        //welcometojava
     // i=0 wel,i=1 elc, i=2 lco,i=3 com,i=4 ome, i=5 met, i=6 eto,i=7 toj, i=8 oja, i=9 jav,i=10 ava
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }

        // Sort the substrings lexicographically
        Collections.sort(substrings);

        // The smallest substring is the first in the sorted list
        String smallest = substrings.get(0);

        // The largest substring is the last in the sorted list
        String largest = substrings.get(substrings.size() - 1);

        System.out.println(smallest);
        System.out.println(largest);

	}

}
