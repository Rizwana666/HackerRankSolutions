package com.hacker.rank.pratice.strings;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class StringSplitReqularExpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<String> lines = Arrays.stream(s.split("[\\s@&.,_'!?$+-]+"))
                .map(x -> x.trim())
                .filter(x -> x.length() > 0)
                .collect(Collectors.toList());
        System.out.println(lines.size());
        for (String line : lines) {
            System.out.println(line);
        }
        scan.close();
    }
}