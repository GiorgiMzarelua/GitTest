import java.awt.Color;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/*
 * (დაწერილი უნდა გქონდეთ problem set-ის ამოცანა 22- ჭადრაკის დაფა) გადააკეთეთ თქვენი კოდი ისე, რომ შექმნილი ჭადრაკის
 *  დაფა წარმოადგენდეს GCompound ობიექტს. დაწერეთ მეთოდი:private GCompound chessBoard(double cellLength, 
 *  double numCells)run-ში კი გამოიძახეთ ეს მეთოდი, მისი გამოყენებით შექმენით GCompound board ობიექტი
 *   და დაამატეთ 50, 100 კოორდინატებზე.
 */
public class seminar10i2 extends GraphicsProgram{
	public void run(){
		for(int i = 0; i < 4; i++){
			startWithBlackRow();
			startWithWhiteRow();
		}
	}

	private void startWithWhiteRow() {
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4 + getWidth() / 8);
			double y = (double) (getHeight() / 8);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4 + getWidth() / 8);
			double y = (double) (getHeight() * 3 / 8);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4 + getWidth() / 8);
			double y = (double) (getHeight() * 5 / 8);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4 + getWidth() / 8);
			double y = (double) (getHeight() * 7 / 8);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
	}

	private void startWithBlackRow() {
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (0);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() / 4);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() / 2);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() * 3 / 4);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
	}
}
