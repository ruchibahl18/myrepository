package com.sorting;

import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args) {
		int n;
		int a[] = new int[100];
		int []result;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i =0; i <n ;i++) {
			a[i] = scan.nextInt();
		}
		
		result = bubbleSort(a,n);
		
		for(int i =0; i < n;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	private static int[] bubbleSort(int[] a, int n) {
		int temp;
		boolean flag= true;
		for(int i =0;i<n && flag==true; i++) {
			flag = false;
			for(int j =0;j<n-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = true;
				}
			}
		}
		return a;
	}

}
