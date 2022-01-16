package com.sorting;

import java.util.Arrays;

import com.sorting.mergesort.MergeSort;

public class DriverClass {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 6, 8, 1, 3, 4, 2, 9, 7 };

		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}

}
