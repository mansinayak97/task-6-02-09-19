import java.io.Serializable;

public class Game implements Serializable {
	private int xPos;
	private int yPos;
	private int sPos;
	private transient PlayerInfo info = new PlayerInfo();

	public void moveH(int pts) {
		xPos += pts;
	}

	public void moveV(int pts) {
		yPos += pts;
	}

	public void moveS(int pts) {
		sPos += pts;
	}

	public void showPos() {
		System.out.println("CURRENT POS : " + xPos + "," + yPos + "," + sPos);
	}
}
