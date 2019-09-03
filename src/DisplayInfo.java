import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DisplayInfo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("G:/Emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee) ois.readObject();
		System.out.println("Employee [empNo=" + emp.getEmpNo() + ", eName=" + emp.geteName() + ", salary="
				+ emp.getSalary() + ", designation=" + emp.getDesignation() + ", dept=" + emp.getDept()
				+ "]");
	}

}
