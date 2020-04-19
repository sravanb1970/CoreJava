package com.w3resources.arrays;

import java.util.Arrays;

public class ArrayPrograms {

	// program to sort numeric values of an array
	public int[] sortArrayValues(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("Values in the array are - " + Arrays.toString(array));
		return array;
	}

	// program to search an element in an array
	public boolean searchElement(int[] array, int value) {
		// searching can be done in 2 ways
		// 1- binary search
		return false;

	}

	public void maxAndMin(int[] array) {
		// array = new int[] {54,20,5,81};
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
//			max = (max<array[i]?array[i]:max);
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Min - " + min);
		System.out.println("Max - " + max);
	}

	public int[] arrayReverse(int[] array) {
//		Arrays.so
		int temp = 0;
//		// {255,9,8,78,36,1000,150,20,110,15,257};
//		for (int i = 0; i < array.length/2; i++) {
//			for (int j = 0; j <= i; j++) {
//				temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//
//		}
//		//second way 
		int[] newArray = new int[array.length];
		newArray[0] = array[0];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - i - 1];
		}
		System.out.println("Array Values are - " + Arrays.toString(newArray));
		return newArray;
	}

	public int[] removeElement(int[] array, int value) {

		int[] newArray = null;
		newArray = new int[array.length - 1];
//{55,255,9,8,78,36,1000,150,20,110,15,257,54,74};
		for (int i = 0; i < array.length - 1; i++) {
			newArray[i] = array[i];
			if (array[i] == value) {
				for (int j = i; j < array.length - 1; j++) {
					newArray[j] = array[j + 1];
//					break;					
				}
				break;
			}
		}
		System.out.println("-- " + Arrays.toString(newArray));
		return newArray;

//		int[] newArray;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == value) {
////				array[i] = array[i + 1];
//				for (int j = i; j < array.length - 1; j++) {
//					array[j] = array[j + 1];
//				}
//
//			}
//
//		}
//		System.out.println(Arrays.toString(array));
//		//here last value will be repeated as we can't change the size of an array, to avoid that
//		//we can create a new array after removing the values
//		return -1;
	}

	public int[] insertElement(int[] array, int position, int value) {
		int[] newArray = null;
		newArray = new int[array.length + 1];
		// {55,255,9,8,78,36,1000,150,20,110,15,257,54,74};
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i];
			if (i == position) {
				newArray[i] = value;
//					i++;
				for (int j = i; j < array.length; j++) {
					newArray[j + 1] = array[j];
				}
				break;
			}
		}

//		array[position] = value;
		if (null != newArray) {
			System.out.println(Arrays.toString(newArray));
		}
		return newArray;
	}

	/*
	 * method to find duplicate values in an integer array
	 */
	public int duplicateValues(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					System.out.println("Duplicate value - " + array[j]);
				}

			}
		}
		return 1;
	}

	public int noOfDuplicateValues(int[] array) {

//using recursive method call		
		for (int i = 0; i < array.length; i++) {
			duplicateChecker(array, array[i], i);
			// arr 55 0
		}

		return 1;
	}

	public int duplicateChecker(int[] array, int value, int j) {
		int temp = 1;
		for (int i = j + 1; i < array.length; i++) {
			if (array[i] == value) {
				temp++;
				System.out.println(array[i] + " repeated - " + temp + " times");
			}
		}
		return temp;
	}
	
	
	public void duplicateStringValues(String[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])) {
					temp++;
					System.out.println(array[i] + " repeated - " + temp + " times");					
				}
				
			}
		}
	}
	
	
	public void commonElements(int[] array1, int[] array2) {
		int temp=1;
		for(int i: array1) {
			for(int j:array2) {
				if(i == j+1) {
					temp++;
					System.out.println(j + " repeated - " + temp + " times");					
			
				}
			}
		}
	}
	
	
	
	
	public void removeDuplicates(int[] array) {
		int[] newArray = new int[array.length];
		int temp =0;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<newArray.length-1;j++) {
				if(newArray[j] == array[i+1]) {					
					break;

				}
				newArray[j] = array[i];
			}

		}
		System.out.println("Array values are - " + Arrays.toString(newArray));
	}
	
	
	public void createNewArray() {
		int[] arr = new int[]{25,54,25,65,86,65};
		int[] arr1 = new int[arr.length+1];

		int temp =0;
		int j;
		for(int i=0;i<arr.length;i++) {
			temp =0;
			for(j=0;j<arr1.length;j++) {			
				
				if(arr1[j] != arr[i] && i != j ) {
					arr1[temp] = arr[i];
					temp++;
				}

			}
			

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		ArrayPrograms s = new ArrayPrograms();
		s.createNewArray();
	}
	

}
