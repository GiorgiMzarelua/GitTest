import stanford.karel.SuperKarel;
public class assignment1 extends SuperKarel{
    public void run(){
    	findAmagazine();
    	pickBeeper();
    	backTostart();
    }

	private void backTostart() {
		//after finding the magazine Karel returns to start
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
	}

	private void findAmagazine() {
		//this method finds the magazine 
		turnRight();
		move();
		turnLeft();
		while(noBeepersPresent()){
			move();
		}
	}
}