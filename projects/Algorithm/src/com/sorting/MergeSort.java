package com.sorting;

import java.util.Scanner;

public class MergeSort {

	private static int a[] = new int[100];
	private static int result[];
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		result = new int[a.length];

		mergeSort(0, n-1);

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static void mergeSort(int l, int h) {
		int m;
		if (l < h) {
			 m = (l+h)/2;
			 mergeSort(l, m);
			 mergeSort(m+1 , h);
			 merge(l,m,h);
		}
		else {
			return;
		}
	}

	private static void merge(int l,int m,int h) {

		int i = l, j = m+1, k = l;
		while (i <= m && j <= h) {
			if (a[i] < a[j]) {
				result[k] = a[i];
				i++;
				k++;
			} else {
				result[k] = a[j];
				j++;
				k++;
			}
		}
		while (i <= m) {
			result[k] = a[i];
			i++;
			k++;
		}
		while (j <= h) {
			result[k] = a[j];
			j++;
			k++;
		}
		for(k=l;k<=h;k++){
			a[k] = result[k];
		}
			
	}

}
