
class Employee{
	String name;
	String address;
	int yoj;
	Employee(String n,String a,int y){
		name=n;
		address=a;
		yoj=y;
	}
	public static void main(String[] args){
		Employee emp1 = new Employee("Robert","64C-WallsStreet",1994);
		Employee emp2 = new Employee("Sam","68D-WallsStreet",2000);
		Employee emp3 = new Employee("John","26B-WallsStreet",1999);
		System.out.print("Name Year of Joining Address ");
		System.out.print(emp1.name+" "+emp1.yoj+" "+emp1.address+" ");
		System.out.print(emp2.name+" "+emp2.yoj+" "+emp2.address+" ");
		System.out.print(emp3.name+" "+emp3.yoj+" "+emp3.address+" ");
	}
}