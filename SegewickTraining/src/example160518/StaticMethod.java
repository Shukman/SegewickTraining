package example160518;

public class StaticMethod {
	
	public static void main(String[] args) {
		
		System.out.println("Абсолютная величина значения int: " + abs(-4));
		
		System.out.println("Абсолютная величина значения int: " + abs(-4.0));
		
		System.out.println("Проверка, простое ли число: " + isPrime(5));
		
		System.out.println("Квадратный корень(метод Ньютона): " + sqrt(81));
		
		System.out.println("Гипотенуза прямоугольного треугольника: " + hypotenuse(3, 4));
		
		System.out.println("Гармоническое число: " + H(2));
		
	}
	
	// Абсолютная величина значения int
	public static int abs(int x){
		if(x < 0) {
			return -x;
		} else {
			return x;
		}
	}
	// Абсолютная величина значения double
	public static double abs(double x){
		if(x < 0) {
			return -x;
		} else {
			return x;
		}
	}
	// Проверка, простое ли число
	public static boolean isPrime(int N){
		if(N < 2) {
			return false;
		}
		for (int i = 2; i*i <= N; i++) {
			if(N % i == 0){
				return false;
			}
		}
		return true;
	}
	// Квадратный корень(метод Ньютона)
	public static double sqrt(double c){
		if(c < 0) {
			return Double.NaN;
		}
		double err = 1e-15;
		double t = c;
		while(Math.abs(t - c/t) > err * t) {
			t = (c/t + t) / 2.0;
		}
		return t;
	}
	// Гипотенуза прямоугольного треугольника
	public static double hypotenuse(double a, double b){
		return Math.sqrt(a*a + b*b);
	}
	// Гармоническое число
	public static double H(int N){
		double sum = 0.0;
		for (int i = 1; i <= N; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	

}
