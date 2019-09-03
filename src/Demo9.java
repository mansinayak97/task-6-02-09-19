import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Demo9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number");
		int empno=sc.nextInt();
		System.out.println("Enter employee name");
		String empname=sc.next();
		System.out.println("Enter employee salary");
		int empsalary=sc.nextInt();
		System.out.println("Enter employee designation");
		String designation=sc.next();
		System.out.println("Enter employee department");
		String department=sc.next();
		Employee employee=new Employee(empno,empname,empsalary,designation,department);
		
		FileOutputStream fos=new FileOutputStream("G:/Emp.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employee);
		oos.close();
		fos.close();
		System.out.println("====object serialized successfully====");
	}

}
