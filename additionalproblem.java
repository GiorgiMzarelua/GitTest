import stanford.karel.Karel;
public class additionalproblem extends Karel{
    public void run(){
    	for(int i=0;i<5;i++){
    		drawAhouse();
    	}
      
        	
    }
	private void drawAdoor() {
		move();
		move();
		turnLeft();
		putBeeper();
		for(int i=0;i<3;i++){
			move();
			putBeeper();
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
		for(int i=0;i<3;i++)
		{
			move();
			putBeeper();
		}
		turnLeft();
		turnLeft();
	}
	private void drawAhouse() {
		move();
		move();
		drawAdoor();
		drawAwindow();
		drawAroof();
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
		putBeeper();
		for(int j=1;j<9;j++){
			move();
			putBeeper();
		}
		turnLeft();
		move();
	}
	private void drawAroof() {
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		for(int i=0;i<4;i++){
			move();
		}
		putBeeper();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		move();
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		move();
		putBeeper();
		move();
		putBeeper();
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		putBeeper();
		while(frontIsClear()){
			move();
		}
	}
	private void drawAwindow() {
		for(int i=0;i<5;i++){
			move();
		}
    	putBeeper();
    	move();
    	putBeeper();
    	turnLeft();
    	move();
    	putBeeper();
    	turnLeft();
    	move();
    	putBeeper();
	}
}
