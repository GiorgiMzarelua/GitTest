import stanford.karel.SuperKarel;
public class assignment3 extends SuperKarel{
    public void run(){
    	//this is the body of the code. Alghorithm is that Karel has to color each row like 
    	//a chessboard. After coloring a line he has to return to the starting point of the row
    	//and ascend to the next line. Karel has to do it for each row.
    	putBeeper();
    	while(leftIsClear()){
    		fillInLine();
    		ascend();
    	}
    	fillInLastLine();
    }

	private void fillInLastLine() {
		//Karel mustn't come back to the starting point of the last row, so, this method 
		//Determines that Karel fills the last row so that he does not go back
		while(frontIsClear()){
			if(frontIsClear()){
			    move();	
			}
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}

	private void ascend() {
		//this method ascends Karel to the next row and puts the first beeper of the row.
		if(leftIsClear() & beepersPresent()){
			turnLeft();
			if(frontIsClear()){
				move();
			}
			turnRight();
			if(frontIsClear()){
				move();
			}
			putBeeper();
		}
		if(leftIsClear() & noBeepersPresent()){
			turnLeft();
			if(frontIsClear()){
				move();
			}
			turnRight();
			putBeeper();
		}
	}

	private void fillInLine() {
		//Karel moves till the end of the row and colors it like a chessboard and then comes back
		//to the starting point 
		while(frontIsClear()){
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
		turnBack();
	}

	private void turnBack() {
		//This method returns Karel to the starting point of the row
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}