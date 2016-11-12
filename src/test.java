import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner file = new Scanner(System.in);
		
		System.out.print("Enter Size of Square(N x N):");
		
		System.out.println("N=");
		
		int size = file.nextInt();
		int[][] array = new int[size][size];
		
		System.out.println();
		
		
		
		for (int row = 0; row < array.length; row++) {
			
			System.out.println("Enter Row " + (row + 1) + ": ");
			
			for (int col = 0; col < array[row].length; col++) {
				
				array[row][col] = file.nextInt();
			}
		}
		
		
		System.out.println("Square:");
		for (int row = 0; row < array.length; row++) {
			
			for (int col = 0; col < array[row].length - 1; col++) {
				
				
				
				System.out.print(array[row][col] + ", ");
			}
			
			System.out.print(array[row][array.length - 1]);
			
			System.out.println();
		}
		
		
		
		System.out.println();
		if (!valid(array)) {
			
			
			
			System.out.println("Not a Valid Square" + (array.length * array.length) + ". Each must occur once.");
			
			
		} else {
			if (magic(array)) {
				
				System.out.println("Magic Square");
				
			} else {
				
				System.out.println("Not a Magic Square");
			}
		}

	}

	public static boolean valid(int[][] a) {
		boolean valid = false;
		
		
		
		for (int n = 1; n <= a.length * a.length; n++) {
			
			
			
			for (int row = 0; row < a.length; row++) {
				
				
				
				for (int col = 0; col < a[row].length; col++) {
					
					
					
					if (a[row][col] == n) {
						valid = true;
					}
					
					
					
				}
				
				
				
			}
			
			
			
			if (!valid) {
				return false;
			}
			
			
			
			valid = false;
			
			
			
			
		}
		return true;
	}

	public static boolean magic(int[][] a) {
		boolean magic = true;
		int sum = 0;
		int sum1 = 0;
		
		
		
		for (int col = 0; col < a[0].length; col++) {
			sum += a[0][col];
		}
		
		
		
		
		for (int row = 1; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				sum1 += a[row][col];
			}
			if (!(sum1 == sum)) {
				return false;
			}
			sum1 = 0;
		}
		
		
		

		for (int col = 0; col < a[0].length; col++) {
			for (int row = 0; row < a.length; row++) {
				sum1 += a[row][col];
			}
			if (!(sum1 == sum)) {
				return false;
			}
			sum1 = 0;
		}
		
		
		
		
		
		
		for (int n = 0; n < a.length; n++) {
			sum1 += a[n][n];
		}
		
		
		
		
		if (!(sum1 == sum)) {
			return false;
		}
		
		
		
		
		sum1 = 0;
		for (int n = 0; n < a.length; n++) {
			sum1 += a[a.length - n - 1][a.length - n - 1];
		}
		
		
		
		
		
		if (!(sum1 == sum)) {
			return false;
		}
		
		
		return magic;
	}

}
