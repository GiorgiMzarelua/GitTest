import stanford.karel.SuperKarel;
public class test extends SuperKarel{
    public void run(){
        turnLeft();
        while(frontIsClear()){
        	moveUp();
        }
	}

	private void moveUp() {
		move();
		if(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnLeft();
	}
}
