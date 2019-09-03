import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of file ");
		String path = sc.next();
		System.out.println("Enter number of files in which it should be splitted ");
		int n = sc.nextInt();

		File file = new File(path);
		int len = (int) file.length();
		FileInputStream fis = new FileInputStream(file);
		byte[] barr = new byte[len];
		fis.read(barr);

		int offset = 0;
		int x = len / n;
		String s;
		for (int j = 0; j < n; j++) {
			FileOutputStream fos = new FileOutputStream("G:/data" + j + ".txt");
			fos.write(barr, offset, x);;
			offset += x;
		}
		System.out.println("File Copied");
	}

}
