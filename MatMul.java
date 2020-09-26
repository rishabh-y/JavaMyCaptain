// program to multiply two matrices
import java.util.Scanner;

class Matrix{
	int rows;
	int cols;
	int data[][];

	Matrix(int r , int c){
		rows=r;
		cols=c;
		data= new int [rows][cols];
	}
}

class MatMul{
	public static void main(String[] args){
		
		int row , col , i , j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix A (rows*col): ");
		row= sc.nextInt();
		col=sc.nextInt();
		Matrix matA= new Matrix(row , col);
		System.out.println("Enter the size of matrix B (rows*col): ");
		row= sc.nextInt();
		col=sc.nextInt();
		Matrix matB= new Matrix(row , col);
		//INPUT MATRIX A 
		System.out.println("Enter the values in matrix A row wise");

		for( i=0;i<matA.rows;i++){
			for(j=0;j<matA.cols;j++){
				matA.data[i][j]= sc.nextInt();
			}
		}
		//INPUT MATRIX B
		System.out.println("Enter the values in matrix B row wise");
		for( i=0;i<matB.rows;i++){
			for(j=0;j<matB.cols;j++){
				matB.data[i][j]= sc.nextInt();
			}
		}
		//DISPLAY A
		System.out.println("Matrix A :");
		for( i=0;i<matA.rows;i++){
			for( j=0;j<matA.cols;j++){
				System.out.print(matA.data[i][j]+ " ");
			}
			System.out.println();
		}

		//DISPLAY B
		System.out.println("Matrix B :");
		for( i=0;i<matB.rows;i++){
			for( j=0;j<matB.cols;j++){
				System.out.print(matB.data[i][j]+ " ");
			}
			System.out.println();
		}
		
		//SUM OF MATRICES
		if((matA.rows != matB.rows) || (matA.cols != matB.cols)){
			System.out.println("Addition cannot be performed with given dimensions");
		}
		else{
			Matrix sum= new Matrix(row ,col);
			for(i=0 ; i<row ; i++){
				for(j=0 ; j<col ; j++){
					sum.data[i][j]=matA.data[i][j]+matB.data[i][j];
				}
			}
			System.out.println("Addition of Matrix A and Matrix B :");
			for(i=0;i<row;i++){
				for(j=0 ; j<col ; j++){
					System.out.print(sum.data[i][j]+ " ");
				}
			System.out.println();
			}
		}
		//MULTIPLICATION
		if(matA.cols != matB.rows){
			System.out.println("Multiplication cannot be performed with given dimensions");
		}
		else
		{
			System.out.println("Multiplication of Matrix A and Matrix B :");

			Matrix mul = new Matrix(matA.rows, matB.cols);
			int temp;
			for(i=0;i<matA.rows;i++){
				for(j=0 ; j<matB.cols; j++){
					temp=0;
					for(int k=0;k<matA.cols ; k++){
						temp = temp + matA.data[i][k]*matB.data[k][j];
					}
					mul.data[i][j]=temp;
					System.out.print(mul.data[i][j]+ " ");
				}
				System.out.println();
			}


		}

		
	}
}