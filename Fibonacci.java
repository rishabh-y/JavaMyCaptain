import java.util.Scanner;

class Fibonacci{

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int a=0,b=1,c;
		System.out.print("Enter the number of terms to be printed : ");
		int n=scan.nextInt();
		System.out.print(a+" "+b);
		
		for(int i=1;i<=n-2;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}