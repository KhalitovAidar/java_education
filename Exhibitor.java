import java.util.Scanner;

class Exhibitor {

	public static void main(String[] args) {
		double exhibitor = 1;
		int x = 1;

		for (int i = 1; i < 100000000; i++) {
			double fraction = (double)degree(x, i) / fac(i);
			if (fraction < 0.00001) {
				exhibitor += fraction;
				break;
			}
			else {
				exhibitor += fraction;
			}
		}
		System.out.println(exhibitor);
	}
 
	public static int degree(int x, int i) {
		int n = x;

		for (int j = 1; j < i; j++) {
			n = n * x;
		}

		return n;
	}

	public static int fac(int i) { 
		int n = 1;

		for (int j = 1; j <= i; j++){
			n = n * j;
		}

		return n;
	}
}