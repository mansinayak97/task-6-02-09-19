import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Demo7 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename1 With path");
		String filename1 = sc.next();
		System.out.println("Enter filename2 With path");
		String filename2 = sc.next();
		FileInputStream fis1 = new FileInputStream(filename1);
		FileInputStream fis2 = new FileInputStream(filename2);
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		 int j;    
		   while((j=sis.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   sis.close();    
		   fis1.close();    
		   fis2.close(); 
	}
}
	