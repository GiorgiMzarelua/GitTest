import stanford.karel.Karel;
public class test extends Karel{
    public void run(){
    	move();
		move();
		turnLeft();
		for(int j=0;j<8;j++){
			putBeeper();
			move();
		}
		turnLeft();
		turnLeft();
		turnLeft();
		for(int j=1;j<7;j++){
			putBeeper();
			move();
		}
		turnLeft();
		turnLeft();
		turnLeft();
		for(int j=1;j<9;j++){
			putBeeper();
			move();
		}
		turnLeft();
		move();
    }
}
