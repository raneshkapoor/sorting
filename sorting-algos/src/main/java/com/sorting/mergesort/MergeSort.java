package com.sorting.mergesort;

public class MergeSort {

	/*
	 * Method for invoking Merge Sort for Given Part of Array.
	 * left and right are Starting and Ending Positions of Array part to be sorted.
	 */
	public void mergeSort(int nums[], int left, int right) {

		/*
		 * Check if Left pointer is not to the left of right part.
		 */
		if (left >= right) {
			return;
		}

		/*
		 * Calculate Mid Position for Left and Right Pointers.
		 */
		int mid = (left + right) / 2;

		/*
		 * Execute Sorting process for Left Half
		 */
		mergeSort(nums, left, mid);

		/*
		 * Execute Sorting Process for Right Half
		 */
		mergeSort(nums, mid + 1, right);

		/*
		 * Merge Left and Right Sorted Parts
		 */
		merge(nums, left, mid, right);

	}

	/*
	 * Method for Merging two sorted parts into one part.
	 * Array numbers left to mid and right are separately sorted.
	 */
	private void merge(int nums[], int left, int mid, int right) {

		/*
		 * Calculating the Size of Left and Right Parts to be Merged.
		 */
		int leftLength = mid - left + 1;
		int rightLength = right - mid;

		/*
		 * Creating Arrays of Left and Right Parts.
		 */
		int leftNums[] = new int[leftLength];
		int rightNums[] = new int[rightLength];

		/*
		 * Copying the Values from Original Array to Temporary Arrays.
		 */
		for (int i = 0; i < leftLength; i++) {
			leftNums[i] = nums[left + i];
		}
		for (int i = 0; i < rightLength; i++) {
			rightNums[i] = nums[mid + 1 + i];
		}

		/*
		 * Creating Pointers to Sort Temporary Arrays.
		 */
		int leftPointer = 0;
		int rightPointer = 0;
		int pointer = left;

		/*
		 * Merging Temporary Arrays into Original Array by comparing.
		 */
		while (leftPointer < leftLength && rightPointer < rightLength) {
			if (leftNums[leftPointer] < rightNums[rightPointer]) {
				nums[pointer++] = leftNums[leftPointer++];
			} else {
				nums[pointer++] = rightNums[rightPointer++];
			}
		}

		/*
		 * Adding Leftover numbers in any of the Temporary Array into Original Array.
		 */
		while (leftPointer < leftLength) {
			nums[pointer++] = leftNums[leftPointer++];
		}
		while (rightPointer < rightLength) {
			nums[pointer++] = rightNums[rightPointer++];
		}

	}

}
