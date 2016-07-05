package com.sorting;

import java.util.Scanner;

public class ShellSort {

	private static int a[] = new int[100];
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		shellSort((0+n)/2,n);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void shellSort(int h,int n) {
		int tmp;
		while (h > 0) {
			for (int i = 0; (i + h) < n; i++) {
				if (a[i] > a[i + h]) {
					tmp = a[i];
					a[i] = a[i + h];
					a[i + h] = tmp;
				}
			}
			h--;
		}
		
		/*for(int i=1;i<n;i++) {
			int j = i-1;
			int val = a[i];
			while(j>=0 && a[j] > val){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = val;
		}*/
	}
}
