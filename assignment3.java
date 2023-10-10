import stanford.karel.SuperKarel;
public class assignment3 extends SuperKarel{
    public void run(){
    	putBeeper();
    	while(leftIsClear()){
    		fillInLine();
    		ascend();
    	}
    	fillInLastLine();
    }

	private void fillInLastLine() {
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}

	private void ascend() {
		if(leftIsClear() & beepersPresent()){
			turnLeft();
			move();
			turnRight();
			move();
			putBeeper();
		}
		if(leftIsClear() & noBeepersPresent()){
			turnLeft();
			move();
			turnRight();
			putBeeper();
		}
	}

	private void fillInLine() {
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
		turnBack();
	}

	private void turnBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}