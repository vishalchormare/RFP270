package day3basic;

public class ArrayHandling {

	static void printArray() {

		System.out.println("1 to 10 Print Array");
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("********************************************");

	}

	static void fequancyArray() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 2, 6, 8, 9, 7, 6, 5, 2, 4 };
		System.out.println("Print Fequancy Array : ");
		int[] freq = new int[arr.length];
		for (int e : arr) {
			freq[e]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {

				System.out.println("Element " + i + " times " + freq[i]);
			}
		}
		System.out.println("**********************************");
	}

	static void largestElementOfArray() {

		int i;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 1, 4 };
		int max = arr[0];
		System.out.println("The array element : ");
		for (i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("The lagest number of array : " + " " + max);
		System.out.println("*******************************************");
	}

	static void smallestElementofArray() {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Smallest element of array : " + small);
		System.out.println("***************************************");
	}

	static void evenposistionofArray() {
		int[] arr = new int[] { 1, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Elements of given array present on even position: ");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("********************************************************");
	}

	static int oddpositionofArray(int arr[]) {

		System.out.println("Elements of given array present on odd position: ");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("********************************************************");
		return 0;
	}

	static void reversElement() {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 6, 8, 9 };

		int i = 0;

		for (i = arr.length - 1; i >= 0; i--) {
			System.out.println("Revers Element of array" + " " + arr[i]);

		}
		System.out.println("******************");
	}

	static void duplicateElementofArray() {
		int i, j;
		int[] arr = new int[] { 1, 2, 3, 2, 3, 4, 5, 5, 6, 7, 8 };

		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

	static void sortArryaofElementinAccendingOrder() {

		int i, j;
		int temp = 0;
		int arr[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println("Sort Element of Accending Order");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("***********************************");

	}

	static void secondLargestElementofArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 3, 4, 5, 8, 6 };
		int i, j, temp = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(" " + arr[1]);

	}

	public static void main(String[] args) {

		printArray();
		fequancyArray();
		largestElementOfArray();
		smallestElementofArray();
		evenposistionofArray();
		oddpositionofArray(new int[] { 1, 2, 3, 4, 55, 66, 77, 80 });
		reversElement();
		duplicateElementofArray();
		sortArryaofElementinAccendingOrder();
		secondLargestElementofArray();
	}
}