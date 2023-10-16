import acm.graphics.GLine;
import acm.program.GraphicsProgram;
public class problem21 extends GraphicsProgram{
    public void run(){
    	drawTable();
    }

	private void drawTable() {
		drawRows();
		drawColumns();
	}

	private void drawColumns() {
		for(int i = 1; i <= 9; i++){
			double x1 = getWidth() * i / 10;
			double y1 = 0;
			double x2 = getWidth() * i / 10;
			double y2 = getHeight();
			GLine line = new GLine(x1, y1, x2, y2);
			add(line);
		}
	}

	private void drawRows() {
		for(int i = 1; i <= 9; i++){
			double x1 = 0;
			double y1 = getHeight() * i / 10;
			double x2 = getWidth();
			double y2 = getHeight() * i / 10;
			GLine line = new GLine(x1, y1, x2, y2);
			add(line);
		}
	}
}
