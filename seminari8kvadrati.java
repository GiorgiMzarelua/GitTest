import acm.program.GraphicsProgram;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;

public class seminari8kvadrati extends GraphicsProgram{
	public void run(){
		int size = readInt("enter the size of a side of a square: ");
		drawTheSquare(size);
	}

	private void drawTheSquare(int size) {
		GRect square = new GRect(size, size);
		int x = getWidth() / 2 - size / 2;
		int y = getHeight() / 2 - size / 2;
		add(square);
	}
}
