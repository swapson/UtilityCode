
// https://en.wikipedia.org/wiki/Fibonacci_number
// For Fibonacci sequence non recursive algorithm uses count check, if its less than 3 it need to print terms independently 
// from 3rd term it starts loop. Using below login we can use loop for term 1,2,...n
public class FibonacciWithoutRecursionNSequence {

	public static void main(String[] args) {
		for (int i = 1; i <= 13; i++) {
			printFibonacciSequence(i);
		}
	}

	public static void printFibonacciSequence(int term) {
		System.out.println("pritingin Fibonacci for term: " + term);
		int n1 = -1, n2 = 1, n3;
		while (term >= 1) {
			n3 = n1 + n2;
			System.out.printf("%d ", n3);
			n1 = n2;
			n2 = n3;
			term--;
		}
		System.out.println();
	}

}
