package com.hacker.rank.Statistics;

import java.util.*;

public class MeanMedianMode {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		double median = 0.0;
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();
		int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).filter(x -> !x.equals(""))
				.mapToInt(Integer::parseInt).sorted().toArray();

		int sum = Arrays.stream(arr).sum();

		System.out.println((double) sum / arr.length);

		if (N % 2 == 0) {

			median = (double) (arr[(N / 2) - 1] + arr[((N / 2) + 1) - 1]) / 2;
		} else {

			median = arr[(N + 1) / 2];

		}

		System.out.println(median);

		HashMap<Integer, Integer> map = new HashMap<>();
		int maxOccurrences = 0;
		int mode = Integer.MAX_VALUE;
		for (int num : arr) {
			map.merge(num, 1, Integer::sum);

			int occurrences = map.get(num);

			if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
				maxOccurrences = occurrences;
				mode = num;
			}
		}

		System.out.println(mode);

	}

}
