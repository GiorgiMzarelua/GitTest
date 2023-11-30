import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class seminari20 extends GraphicsProgram{
	private GOval circle;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	addBall();
    }
	private void addBall() {
		double x = rgen.nextDouble(50, getWidth() - 50);
		double y = rgen.nextDouble(50, getHeight() - 50);
		double radius = rgen.nextDouble(20, 150);
		circle = new GOval(x, y, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
}
