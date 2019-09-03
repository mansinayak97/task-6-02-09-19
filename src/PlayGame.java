import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter mode 1 for New GAme and 2 for resuming previous one");
		int ch=sc.nextInt();
		System.out.println("horizontal Move");
		int x=sc.nextInt();
		System.out.println("Vertical Move");
		int y=sc.nextInt();
		System.out.println("Space Move : ");
		int z=sc.nextInt();
		
		Game g=null;
		if(ch==1)
		{
			g=new Game();
		}else
		{
			FileInputStream fis=new FileInputStream("");
			ObjectInputStream ois=new ObjectInputStream(fis);
			g=(Game)ois.readObject();
		}
		g.moveH(x);g.moveV(y);g.moveS(z);
		g.showPos();
		System.out.println("showing game instance");
		FileOutputStream fos=new FileOutputStream("");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close();
		fos.close();
		System.out.println("closing game");
	}

}
