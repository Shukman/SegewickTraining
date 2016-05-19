package example160518;

public class Operators {
	
	public static void main(String[] args) {
		
		// объявление
		double j;
		int i;
		int max;

		// инициализирующее объявдение
		int sum = 0;
		int N = 5;
		int x = -2;
		int y = 2;
		i = 0;
		int b = 1;
		double c = 3.141592625; 
		
		// присваивание
		int a = b + 3;
		double discriminant = b * b - 4.0 * c;
		
		// неявное присваивание
		i++;
		i += 1;
		
		// условный оператор(if)
		if(x < 0) {
			x = -x;
		}
		
		// условный оператор(if else)
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		
		// цикл(while)
		int v = 0;
		while(v <= N) {
			v = 2 * v;
		}
		
		double t = c;
		while(Math.abs(t - c/t) > 15*t) {
			t = (c/t + t)/2.0;
		}
		
		// цикл(for)
		for (i = 1; i <= N; i++) {
			sum += 1.0/i;
		}
		
		// вызов 
	//	int key = StdIn.readIn();
		
		// возврат
		//return false;
	}

}
