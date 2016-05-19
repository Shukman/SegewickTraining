package example160518;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;

public class StaticMethod2 {
	
	public static void main(String[] args) {
		
		System.out.println("Случайное значение double из диапазона [a, b]: " + uniform(3.0, 9.0));
		
		System.out.println("Случайное значение int из диапазона [0..N]: " + uniform(6));
		
		System.out.println("Случайное значение int из диапазона [lo..hi]: " + uniform(2, 9));
		
		double[] k = {0.1, 0.3, 0.4, 0.2};
		System.out.println("Случайное значение int из дискретного распределения(i с вероятностю a[i]): " + discrete(k));
	
		double[] s = {1, 3, 4, 2, 7, 9, 12, 5, 8};
		shuffle(s);
		System.out.println("Случайное перемешивание элементов в массиве значений double: " + Arrays.toString(s));
	
	}
	
	// Случайное значение double из диапазона [a,b]
	public static double uniform(double a, double b){
		return a + StdRandom.random() * (b - a);
	}
	
	// Случайное значение int из диапазона [0..N]
	public static int uniform(int N){
		return (int)(StdRandom.random() * N);
	}
	
	// Случайное значение int из диапазона [lo..hi]
	public static int uniform(int lo, int hi){
		return lo + StdRandom.uniform(hi - lo);
	}
	
	// Случайное значение int из дискретного распределения(i с вероятностю a[i])
	public static int discrete(double[] a){
		// сумма элементов []a должна быть равна 1
		double r = StdRandom.random();
		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if(sum >= r) {
				return i;
			}
		}
		return -1;
	}
	
	// Случайное перемешивание элементов в массиве значений double
	public static void shuffle(double[] a){
		int N = a.length;
		for (int i = 0; i < N; i++) {
			// Обмен a[i] со случайными элементами из a[i..N-1]
			int r = StdRandom.uniform(N-i);
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
}
