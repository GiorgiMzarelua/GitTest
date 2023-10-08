import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
    	while(frontIsClear()){
    		fixTheColumn();
    		for(int i=0;i<4;i++){
    			move();
    		}
    	fixTheColumn();
    	}
    }

	private void fixTheColumn() {
		moveUp();
		moveDown();
	}
	private void moveDown() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void moveUp() {
		turnLeft();
		while(frontIsClear()){
			checkBeeper();
			move();
		}
		checkBeeper();
	}
	
	private void checkBeeper() {
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}
