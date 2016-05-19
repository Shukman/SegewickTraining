package example160518;

import java.util.Arrays;

public class Massive {
	
	public static void main(String[] args) {
		
		double[] a = {1, 4, -1, 6, 2, 19, 3, 0, 21, -17}; 
		int[] a1 = {1, 4, -1, 6, 2, 19, 3, 0, 21, -17}; 

		
		// Поиск максимального значения в массиве
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println("Поиск максимального значения в массиве = " + max);
		
		
		System.out.println();
		// Вычисление среднего значения массива
		int N = a.length;
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += a[i];
		}
		double average = sum / N;
		System.out.println("Общая сумма в массиве = " + sum);
		System.out.println("Вычисление среднего значения массива = " + average);
		
		
		System.out.println();
		// Копирование значений в другой массив
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			b[i] = (int)a[i];
		}
		System.out.println("Копирование значений в другой массив: \n" + Arrays.toString(b));
		
		
		System.out.println();
		// Перестановка элементов массива в обратном порядке
		for (int i = 0; i < N/2; i++) {
			double temp = a[i];
			a[i] = a[N-1-i];
			a[N-1-i] = temp;
		}
		System.out.println("Перестановка элементов массива в обратном порядке: \n" + Arrays.toString(a));
		
		int[] k = new int[N];
		for (int i = N-1; i >= 0; i--) {
			k[i] = a1[N - i - 1];
		}
		System.out.println("Перестановка элементов массива в обратном порядке: \n" + Arrays.toString(k));
	}
}
