package com.sorting;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		int n;
		int a[] = new int[100];
		int[] result;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		result = insertionSort(a, n);

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] insertionSort(int[] a, int n) {
		int val, i, j;
		for (j = 1; j < n; j++) {
			val = a[j];
			i = j-1;
			while(i>=0 && a[i]>val) {
				a[i+1] =a[i];
				i--;
			}
			a[i+1] = val;
 		}
		return a;
	}

}
