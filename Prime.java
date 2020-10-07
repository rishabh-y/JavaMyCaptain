import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		boolean isPrime=true;
		System.out.println("Please insert any number: ");
		int num = scan.nextInt();
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(num+" is prime number.");
		}
		else{
			System.out.println(num+" is not a prime number.");
		}
	}
}