import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("G:/NewDemoIO.txt");
			fw = new FileWriter("G:/NewDemoIOCopy.txt");
			int c = fr.read();
			while (c != -1) {
				fw.write(c);
				c = fr.read();
			}
			System.out.println("file data copied");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			close(fr);
			close(fw);
		}
	}

	public static void close(Closeable stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException e) {

		}
	}
}
