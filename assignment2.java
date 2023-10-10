import stanford.karel.SuperKarel;
public class assignment2 extends SuperKarel{
    public void run(){
    	while(frontIsClear()){
    		fixTheColumn();
    		for(int i=0;i<4;i++){
    			move();
    		}
    	}
    	fixTheColumn();
    }

	private void fixTheColumn() {
		//this method fixes columns. Karel ascends to top of the column while he fixes it 
		// at the same time and then comes back
		moveUp();
		moveDown();
	}
	private void moveDown() {
		//Karel descends to the first row after fixing the column
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void moveUp() {
		//Karel fixes the column 
		turnLeft();
		while(frontIsClear()){
			checkBeeper();
			move();
		}
		checkBeeper();
	}
	
	private void checkBeeper() {
		//Karel checks whether or not beeper presents 
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}