import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
    	findAmagazine();
    	pickBeeper();
    	backTostart();
    }

	private void backTostart() {
		// TODO Auto-generated method stub
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
	}

	private void findAmagazine() {
		// TODO Auto-generated method stub
		turnRight();
		move();
		turnLeft();
		while(noBeepersPresent()){
			move();
		}
	}
}
