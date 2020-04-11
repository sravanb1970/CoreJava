package com.w3resources.arrays;

public class ClientApp {

	
	public static void main(String[] args) {
		ArrayPrograms sortingArrays = new ArrayPrograms();
		int[] arr = new int[] {55,255,9,8,78,36,1000,150,20,255,110,15,257,54,74,150,86,86};
		int[] arr1 = new int[] {58,257,54,74,150,86};

		String[] arrString = new String[] {"india","america","australia","saudi","india","saudi"};
		
//		System.out.println(sortingArrays.sortArrayValues(arr));
//		sortingArrays.maxAndMin(arr);
//		sortingArrays.arrayReverse(arr);
//		sortingArrays.removeElement(arr, 86);
//		sortingArrays.insertElement(arr, 2, 300);
//		sortingArrays.duplicateValues(arr);
//		sortingArrays.noOfDuplicateValues(arr);	
		
		//sortingArrays.duplicateStringValues(arrString);
//		sortingArrays.commonElements(arr, arr1);
	sortingArrays.removeDuplicates(arr);
	
	
	
	
	
	
	}
}
