package rfp270;

public class Arrays {

	public static void main(String[] args) {
		// Array :- collection of similar type of data
		// Array is a non-primitive data type
		int[] arr = new int[10]; // indexes in array -> 0-9
		arr[0] = 34;
		arr[1] = 42;
		arr[5] = 22;
		arr[6] = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		int[][] arr2 = new int[3][4];

		arr2[0][0] = 23;
		arr2[0][2] = 56;
		arr2[2][1] = 55;
		arr2[1][2] = 33;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}

		int[][][] arr3 = new int[3][4][3];

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int k = 0; k < arr3[i][j].length; k++) {
					System.out.println(arr3[i][j][k]);
				}
			}
		}
		System.out.println("*************************************");
		int[] arr4 = { 6, 4, 5, 7, 10, 56, 323 };

		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();
		int[][] arr5 = { { 3, 6, 7, 8 }, { 5, 6, 3, 2 }, { 2, 5, 6, 8 } };
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.println(arr5[i][j]);
			}
		}

//        int[][][] arr3 = new int[2][2][3];
		int[][][] arr6 = { { { 2, 4, 5 }, { 1, 5, 6 } }, { { 2, 5, 6 }, { 6, 5, 3 } } };

		for (int i = 0; i < arr6.length; ++i) {
			for (int j = 0; j < arr6[i].length; j++) {
				for (int k = 0; k < arr6[i][j].length; k++) {
					System.out.println(arr6[i][j][k]);
				}
			}
		}

		System.out.println("******************************************");

		int[] arr7 = { 2, 5, 6, 7, 8 };

		int sum = 0;
		for (int i = 0; i < arr7.length; i++) {
			sum = sum + arr7[i];
		}

		System.out.println(sum);

	}
}
