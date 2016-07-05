package com.sorting;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		int n;
		int a[] = new int[100];
		int[] result;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		result = selectionSort(a, n);

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] selectionSort(int[] a, int n) {
		int min, tmp, i, j, pos;
		for(i =0;i<n;i++){
			min = a[i];
			pos = i;
			for(j = i; j<n ; j++) {
				if (a[j]< min) {
					min = a[j];
					pos = j;
				}
			}
			tmp = a[pos];
			a[pos] = a[i];
			a[i] = tmp;
		}
		
		return a;
	}

}
