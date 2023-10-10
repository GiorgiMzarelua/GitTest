import stanford.karel.SuperKarel;
public class assignment1 extends SuperKarel{
    public void run(){
    	findAmagazine();
    	pickBeeper();
    	backTostart();
    }

	private void backTostart() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
	}

	private void findAmagazine() {
		turnRight();
		move();
		turnLeft();
		while(noBeepersPresent()){
			move();
		}
	}
}