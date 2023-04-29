import java.util.Random;
import java.util.Scanner;

public class Add_Matrices {
	Scanner scan;
	int matrix1[][], matrix2[][], sum[][];
	int row, column;

	public void create() {
		scan = new Scanner(System.in);
		System.out.println("Matrix Addition");
		// the First matrix is created
		System.out.println("\nEnter number of rows & colums");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		sum = new int[row][column];
		System.out.println("enter the data for first matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		// the second matrix is created
		System.out.println("enter the data for second matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}
	}

	public void display() {
		System.out.println("\nThe First Matrix is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("\t" + matrix1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nThe Second Matrix is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}
	}

	public void add() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("\n\nThe Sum is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("\t" + sum[i][j]);
			}
			System.out.println();
		}
	}
}