import stanford.karel.Karel;
public class test extends Karel{
    public void run(){
    	move();
		move();
		turnLeft();
		for(int i=0;i<4;i++){
			putBeeper();
			move();
		}
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		turnLeft();
    }
}
