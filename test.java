import stanford.karel.Karel;
public class test extends Karel{
    public void run(){
    	facingEast();
    	int width=0;
		int length=0;
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			width++;
		}
		turnLeft();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			length++;
		}
		for(int i=0;i<width;i++){
			int a=length-1;
			if(i%2==0){
				turnLeft();
				move();
				turnLeft();
			}
			if(i%2==1){
				turnLeft();
				turnLeft();
				turnLeft();
				move();
				turnLeft();
				turnLeft();
				turnLeft();
			}
			while(a>0){
				move();
				if(noBeepersPresent()){
					putBeeper();
				}
				a--;
			}
		}
    }
}
