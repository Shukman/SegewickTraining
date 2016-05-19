package example160518;

import java.util.Arrays;

public class RecursionBinarySearch {
	
	public static int rank(int key, int[] a){
		return rank(key, a, 0, a.length - 1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi){
		// если key присутствует в a[], его индекс не меньше lo и не больше hi
		if(lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo)/2;
		if(key < a[mid]) {
			return rank(key, a, lo, mid - 1);
		} else if(key > a[mid]) {
			return rank(key, a, mid + 1, hi);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		
		int[] mas = {1, 15, 6, 14, 8, -1, 4, 3, 2, 5, 7, 11};
		Arrays.sort(mas);
		System.out.println(Arrays.toString(mas));
		
		
		System.out.println(rank(11, mas));
	}
}
