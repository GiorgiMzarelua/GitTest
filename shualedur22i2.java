import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class shualedur22i2 extends GraphicsProgram{
    public void run(){
    	drawGrid();
    }

	private void drawGrid() {
		for(int i = 0; i < 8; i++){
			drawALine(i);
		}
	}

	private void drawALine(int i) {
		for(int j = 0; j < 8; j++){
			GRect rect = new GRect(j * getHeight() / 8, i * getHeight() / 8, getHeight() / 8, getHeight() / 8);
            add(rect);
		}
	}
}
