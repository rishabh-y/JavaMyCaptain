import java.util.Scanner;

class Convert{
	void convert(int min){
		int days = min/(24*60);
		int years= days/365;
		days= days - 365* years;
		System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
	}
};

class Time{
	public static void main(String[] args){
		Convert obj = new Convert();

		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		int min = scan.nextInt();
		obj.convert(min);

	}

}