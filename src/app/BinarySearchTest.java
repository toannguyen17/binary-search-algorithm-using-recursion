package app;

public class BinarySearchTest {
	public static int binarySearch(int[] array, int left, int right, int value){

		int mid = (left+right)/2;

		if (array[mid] == value)
			return mid;

		if (mid >= right)
			return -1;

		if (value < array[mid])
			return binarySearch(array, left, mid-1, value);

		if(value > array[mid])
			return binarySearch(array, mid+1, right, value);

		return  -1;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,22,77,89,99};
		System.out.println("Search \"78\": ");
		System.out.println(binarySearch(array, 0, array.length-1, 78));

		System.out.println("\nSearch \"22\": ");
		System.out.println(binarySearch(array, 0, array.length-1, 22));

		System.out.println("\nSearch \"5\": ");
		System.out.println(binarySearch(array, 0, array.length-1, 5));
	}
}
