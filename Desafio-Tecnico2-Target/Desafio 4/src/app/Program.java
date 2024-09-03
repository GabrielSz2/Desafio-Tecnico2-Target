package app;

public class Program {

	public static void main(String[] args) {
		
		int[] sequenceA = {1, 3, 5, 7};
		int[] sequenceB = {2, 4, 8, 16, 32, 64};
		int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
		int[] sequenceD = {4, 16, 36, 64};
		int[] sequenceE = {1, 1, 2, 3, 5, 8};
		int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
		
		System.out.println("O proximo num da sequencia A: " + nextOdd(sequenceA));
		System.out.println("O proximo num da sequencia B: " + nextDoubleNum(sequenceB));
		System.out.println("O proximo num da sequencia C: " + nextPerfectSquare(sequenceC));
		System.out.println("O proximo num da sequencia D: " + nextPerfectSquarePair(sequenceD));
		System.out.println("O proximo num da sequencia E: " + nextFibonacci(sequenceE));
		System.out.println("O proximo num da sequencia F: " + nextNumSequence(sequenceF));
		
	}
	
	public static int nextOdd(int[] sequence) {
		int lastNum = sequence[sequence.length - 1];
		
		return lastNum + 2;
	}
	
	public static int nextDoubleNum(int[] sequence) {
		int lastNum = sequence[sequence.length - 1];
		
		return lastNum * 2;
	}
	
	public static int nextPerfectSquare(int[] sequence) {
		double lastNum = Math.sqrt(sequence[sequence.length - 1]);
		int num = (int)lastNum + 1;
		num = num * num;
		
		return num;
	}
	
	public static int nextPerfectSquarePair(int[] sequence) {
		double lastNum = Math.sqrt(sequence[sequence.length - 1]);
		int num = (int)lastNum + 2;
		num = num * num;
		
		return num;
	}

	public static int nextFibonacci(int[] sequence) {
		int length = sequence.length;
		int num = sequence[length - 1] + sequence[length - 2];
		
		return num;
	}
	
	public static int nextNumSequence(int[] sequence) {
		int lastNumber = sequence[sequence.length - 1];
		if(lastNumber == 19) {
			return 20;
		} else if(lastNumber == 17) {
			return 18;
		} else {
			return lastNumber + 1;
		}
	}
}
