import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of existing file with path");
		String existingFile = sc.next();
		System.out.println("Enter new name with path");
		String newFile = sc.next();
		File file = new File(existingFile);
		File file2 = new File(newFile);
		byte size = (byte) file.length();

		if (file2.exists())
			throw new java.io.IOException("file exists");
		else if (!file.exists())
			throw new java.io.IOException("file doesn't exists");
		else if (file.isDirectory())
			throw new java.io.IOException("this is a directory and not a file");
		else if (size > 500)
			throw new java.io.IOException("file size>500 bytes");
		else {
			file.renameTo(file2);
			System.out.println("name of  DemoIO.txt has been changed to NewDemoIO.txt");
		}
	}

}
