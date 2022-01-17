package com.sorting.mergesort;

import java.util.Random;

public class MergeSortTest {

	private static final int SIZE = 1000000;
    private static final MergeSort MERGE_SORT = new MergeSort();
	
	public static void main(String[] args) {
		
		int orgArr[] = new int[SIZE];
		
		for(int i = 0;i < SIZE;i++) {
			orgArr[i] = new Random().nextInt();
		}
		
		MERGE_SORT.mergeSort(orgArr, 0, SIZE - 1);
		
		System.out.println("Sorting Result : " + testSorting(orgArr, SIZE));
		
	}
	
	private static boolean testSorting(int arr[], int size) {
		for(int i = 0;i < size - 1;i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
}
