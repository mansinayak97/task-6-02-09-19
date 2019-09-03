import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter City name to add in file");
			String cityName = sc.next();
			String filename = "G:/CityName.txt";
			FileWriter fw = new FileWriter(filename, true);
			fw.write(cityName + "\n");
			fw.close();
			System.out.println("city name added successfully");
		} catch (IOException ioe) {
			System.out.println("IOException: " + ioe.getMessage());
		}
	}

}
