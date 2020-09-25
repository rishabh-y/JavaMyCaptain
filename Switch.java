import java.util.Scanner;

class Switch{
	public static void main(String[] args){
		System.out.println("Enter your choice \n1.Hii \n2.Hey \n3.Hello\n");
		Scanner sc = new Scanner(System.in);
		int ch= sc.nextInt();
		switch(ch){
			case 1: System.out.println("\nHii");
					break;
			case 2: System.out.println("\nHey");
					break;
			case 3: System.out.println("\nHello");
					break;
			default: System.out.println("\nInvalid input");
		}
	}
}