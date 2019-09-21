package chap1;

import java.util.Arrays;

public class InsertionSort {
	public static void insertion_sort(int[] s) {
		int n = s.length;
		for(int i = 1; i < n; i++) {
			int j = i;
			while(j > 0 && s[j] < s[j - 1]) {
				int temp = s[j - 1];
				s[j - 1] = s[j];
				s[j] = temp;
				j = j - 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] s = {2, 7, 4, 9, 3, 1, 5};
		insertion_sort(s);
		System.out.println(Arrays.toString(s));
	}
}
