import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
    	putBeeper();
    	while(leftIsClear()){
    		fillInLine();
    		ascend();
    	}
    	fillInLine();
    }

	private void ascend() {
		if(leftIsClear() & beepersPresent()){
			turnRight();
			move();
			turnRight();
			move();
			putBeeper();
		}
		if(leftIsClear() & noBeepersPresent()){
			turnRight();
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
	}
}
