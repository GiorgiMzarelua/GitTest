import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
        turnLeft();
        while(frontIsClear()){
        	moveUp();
        }
        moveDown();
        putBeeper();
	}

	private void moveDown() {
		turnAround();
		while(frontIsClear()){
			move();
		}
	}

	private void moveUp() {
		move();
		if(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnLeft();
	}
}
