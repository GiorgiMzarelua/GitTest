import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
    	/*
    	 * this is the body of the code. Alghorithm is that Karel has to color each row like 
    	 * a chessboard. After coloring a line he has to return to the starting point of the row
    	 * and ascend to the next line. Karel has to do it for each row.
    	 */
    	if(frontIsBlocked()){
    		oneWidthColumn();
    	}
    	else{
    		putBeeper();
    	    while( leftIsClear()) 
    	    {
    		    fillInLine();
    		    ascend();
    	    }
    	    fillInLastLine();
    	}
    }

	private void oneWidthColumn() {
		/*
		 * If the width of the world is equal to one, then this method will solve this problem
		 * without making non-necessary moves.
		 */
		putBeeper();
        turnLeft();
        while(frontIsClear()){
        	move();
        	if(frontIsClear()){
        		move();
        		putBeeper();
        	}
        }
	}

	private void fillInLastLine() {
		/*
		 * Karel mustn't come back to the starting point of the last row, so, this method 
		 * determines that Karel fills the last row so that he does not go back.
		 */
		
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}

	private void ascend() {
		/*
		 * this method ascends Karel to the next row and puts the first beeper of the row.
		 */
		facingNorth();
		if(frontIsClear() & leftIsBlocked() & beepersPresent()){
			move();
			if(rightIsClear()){
				rightIsClear();
				move();
				putBeeper();
			}
		}
		if(frontIsClear() & rightIsBlocked() & beepersPresent()){
			move();
			if(leftIsClear()){
				turnLeft();
				move();
				putBeeper();
			}
		}
		if(frontIsClear() & rightIsBlocked() & noBeepersPresent()){
			move();
			if(leftIsClear()){
				turnLeft();
			}
			putBeeper();
		}
		if(frontIsClear() & leftIsBlocked() & noBeepersPresent()){
			move();
			if(rightIsClear()){
				turnRight();
			}
			putBeeper();
		}
	}

	private void fillInLine() {
		/*
		 * Karel moves till the end of the row and colors it like a chessboard and then comes back
		 *to the starting point.
		 */
		while( frontIsClear() ){
			move();
			if( frontIsClear() ){
				move();
				putBeeper();
			}
		}
		ascend();
		if(leftIsClear()){
			turnBack();
		}
	}

	private void turnBack() {
		/*
		 * This method returns Karel to the starting point of the row.
		 */
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}
}
