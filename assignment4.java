import stanford.karel.SuperKarel;
public class assignment4 extends SuperKarel{
    public void run(){
    	//Karel has to go to the middle point of the first row, so if he takes
    	//two steps up and one to the right, he will reach the midpoint and after that 
    	//he will descend to the first line and put the beeper.
        turnLeft();
        while(frontIsClear()){
        	moveUp();
        }
        moveDown();
        putBeeper();
	}

	private void moveDown() {
		//after being on the highest midpoint of the table, Karel has to descend to the midpoint 
		//of the first row
		turnAround();
		while(frontIsClear()){
			move();
		}
	}

	private void moveUp() {
		//this method takes Karel to the highest midpoint of the table.
		move();
		if(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnLeft();
	}
}